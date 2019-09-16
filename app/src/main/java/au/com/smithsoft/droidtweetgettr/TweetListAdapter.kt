package au.com.smithsoft.droidtweetgettr

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.tweet_item.view.*

data class TweetItem(
    val tweetTitle: String,
    val tweetContent: String,
    val authorUrl: String
)

class TweetListAdapter: RecyclerView.Adapter<TweetListAdapter.TweetViewHolder>() {

    var data =  mutableListOf<TweetItem>()

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        val item = data[position]

        holder.tweetView.tweetTitle.text = item.tweetTitle
        holder.tweetView.tweetContent.text = item.tweetContent
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.tweet_item, parent, false)
        return TweetViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class TweetViewHolder(val tweetView: View): RecyclerView.ViewHolder(tweetView)
}