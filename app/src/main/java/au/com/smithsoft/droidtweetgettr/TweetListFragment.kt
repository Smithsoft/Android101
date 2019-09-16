package au.com.smithsoft.droidtweetgettr

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.tweet_list_fragment.*
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

class TweetListFragment : Fragment() {

    companion object {
        fun newInstance() = TweetListFragment()
    }

    private lateinit var viewModel: TweetListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        print("onCreateView")
        return inflater.inflate(R.layout.tweet_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(TweetListViewModel::class.java)

        val tweetAdapter = TweetListAdapter()
        context?.let {
            tweetAdapter.placeholderPicture = ContextCompat.getDrawable(it, R.drawable.portrait_placeholder)
        }
        tweetList.adapter = tweetAdapter

        val dividerItemDecoration = DividerItemDecoration(
            context,
            RecyclerView.HORIZONTAL
        )
        tweetList.addItemDecoration(dividerItemDecoration)

        val tweetConnector = viewModel.getTweetsAsLiveData()
        tweetConnector.observe( this, Observer { t: TweetList ->
            tweetAdapter.data.addAll(t)
        })

        print("onActivityCreated")
    }
}
