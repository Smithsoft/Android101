package au.com.smithsoft.droidtweetgettr

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

typealias TweetList = List<TweetItem>

class TweetListViewModel : ViewModel() {

    private var tweetsData = arrayListOf<TweetItem>()

    fun getTweetsAsLiveData(): LiveData<TweetList> {
        val tweets = MutableLiveData<TweetList>()
        tweets.value = tweetsData
        return tweets
    }

    init {
        for (i in 0..19) {
            tweetsData.add(TweetItem("Tweet ${i+1}", "#firstWorldProblems",
                "https://pbs.twimg.com/profile_images/942858479592554497/BbazLO9L_normal.jpg"))
        }
    }

}
