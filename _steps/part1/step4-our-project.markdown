---
layout: step
number: 4
part: 1
title: Our Project
permalink: step4/

#keywords:
#  - term: variable
#    define: 

---

OK - time to get our hands dirty with a real project!

We'll be building a super-basic Twitter client that just fetches one author's tweets from the Twitter API.

![GretaThunberg tweets](../assets/greta-thunberg-tweets.png){:class="img-responsive"}

## AndroidTweetGettr

This programming assignment will go in 3 stages: if you don't get through them all in the face-to-face part of the course please continue in your own time.  We'll break them down so
you can have a running app as we move forward.

The app is called:

* **AndroidTweetGettr**

Your new client wants an app that just fetches tweets when ever they run it from their favourite tweeter, [@GretaThunberg](https://twitter.com/GretaThunberg).

The app will have your clients Twitter API key pasted into it for the MVP version, later you can have this configurable.

The app is based on a [Swift project called SwiftTweetGettr](https://github.com/sarah-j-smith/SwiftTweetGettr) which has been [ported into C++](https://github.com/sarah-j-smith/QTweetGettr) and other languages as well.  The project handily lays out the service API calls you'll need to make.

* [QTweetGettr / twitterclient.cpp](https://github.com/sarah-j-smith/QTweetGettr/blob/master/twitterclient.cpp)

We'll be using [Retrofit](https://codelabs.developers.google.com/codelabs/kotlin-android-training-internet-data/index.html?index=..%2F..android-kotlin-fundamentals#3) to handle the API calls.

## App Design

![App design](../assets/tweet-getter.png){:class="img-responsive"}

Here's the steps we'll follow for our project:

* 1. Build the UI
    * An `Activity` will host a `Fragment`
    * That in turn will have a `RecyclerView` listing the tweets
    * At first we'll have dummy data
    * The dummy data will be hosted ina `ViewModel`
    * It will be a `LiveData<List<TweetItem>>`

* 2. Create the Twitter data source
    * We'll create a `Retrofit` service to fetch
        * the API token 
        * and data
    * We'll hook up to a `TweetRepository`
        * This will have a `getTweets` method
        * The `getTweets` will return a single which...
        * ...will push data into the view models livedata
    * Twitter [images will be fetched](https://codelabs.developers.google.com/codelabs/kotlin-android-training-internet-images/index.html?index=..%2F..android-kotlin-fundamentals#0)
        * using the getImage method from SwiftTweetGettr.

* 3. Cache the data into a `Room` database
    * When the app loads it can fetch Greta tweets from an on device store
    * No more being starved of Greta tweets when network is unavailable
    * If network is available we'll fetch updated tweets and store them

## References

* [Image fetching codelab](https://codelabs.developers.google.com/codelabs/kotlin-android-training-internet-images/index.html?index=..%2F..android-kotlin-fundamentals#0)
* [Retrofit](https://codelabs.developers.google.com/codelabs/kotlin-android-training-internet-data/index.html?index=..%2F..android-kotlin-fundamentals#3)
* [QTweetGettr / twitterclient.cpp](https://github.com/sarah-j-smith/QTweetGettr/blob/master/twitterclient.cpp)