---
layout: step
number: 0
part: 0
title: Tools of the Trade
permalink: step0/

keywords:
#  - term: package.json
#    define: A `package.json` is the file used to store information about a Node.js project, such as its name and its dependencies. Read more [here](https://docs.npmjs.com/files/package.json).

---

Developing for Android can be done with any editor and the Android SDK tools but its much
easier if you use the IntelliJ based IDEA Editor available for Mac, Windows and Linux
called "Android Studio".

## Android Studio

On Apple Mac Android Studio comes as a bundle that includes all of the Java and Kotlin 
development toolchain - compilers and so on - and all of the Android SDK tools plus the
Android Emulators that will allow you to develop for mobile while on your desktop computer.

There is a lot of setup - some of which can be deferred - but its best to get it all done
up front so you don't break your stride with long downloads while learning.

These very paint-by-numbers Google Slide sets step through each part of getting the 
Android Studio set up - latest version as of writing which is 3.5 - follow these
to avoid gotcha's.  The HAXM installer is one such gotcha - mis-clicking can wind you up
with a non-installed buggy & slow emulator!

The final steps - the preferences and checking your setup is right - are a bit more up to
your personal preference.  Try it the way shown in the slides first and if you don't like
it feel free to change it.

* [Install Android Studio (Google Slides)](https://docs.google.com/presentation/d/1pIusJvFrqHlHTY1xZvTXFwGsQiCJ4WK9kGAfB6MKvhk/edit?usp=sharing){:target="_blank"}

* [Configure an AVD (Google Slides)](https://docs.google.com/presentation/d/1dOM_hzxx6tpbmD9wGYUV2TcwtLYwrUnzq0wwSiz3poc/edit?usp=sharing){:target="_blank"}

* [Configure the SDK (Google Slides)](https://docs.google.com/presentation/d/1ZtP6_BoNDKQrY_JQJFQsxihiqBLWoeazIQJnAQ7Z8_U/edit?usp=sharing){:target="_blank"}

* [Configure Android Studio Preferences (Google Slides)](https://docs.google.com/presentation/d/1bdHzWc6vzwq4c8cvhzJk2RX__YqJ7GI23MKpFf2zP7k/edit?usp=sharing){:target="_blank"}

## Terminal

If you have never used the terminal its strongly encouraged to get it set up now so that
you can use when needed.  Make sure its in your task bar, and practice navigating to it
with your short-cut keys.  Run it by pressing ⌘-space and typing "Terminal".

On the Mac dock at the bottom of the screen, right click the Terminal 
(which is now running) and select *Options > Keep in Dock*.

Android includes a [list of critical command line tools](https://developer.android.com/studio/command-line) most of which can also be used from the IDE, but often when searching
for solutions online you'll find those command line tools are quoted as the best solution.

In Android there's often times when you need to do things with Gradle (Android's dependency
manager) that cannot be done from inside the IDE.  Also many useful commands involve 
running Android's "adb" tool for managing devices connected during development.

The standard Mac terminal is fine, or you can setup your own fav such as ITerm.

### Bashrc

If you're a seasoned terminal user just add the below to your bashrc.

For those who've never really modified `.bashrc` or `.bash_profile`
files before just create two files on your desktop named:

* bashrc.txt
* bash_profile.txt

...put the following in there.  

* *bash_profile*

```
source ~/.bashrc

# Have an ls that is in color by default
alias ls='ls -G '

# Android
export ANDROID_HOME="$HOME/Library/Android/sdk"
export PATH="$PATH:${ANDROID_HOME}/platform-tools:${ANDROID_HOME}/tools"

# Java from Android SDK
export JAVA_HOME="/Applications/Android Studio.app/Contents/jre/jdk/Contents/Home"
export PATH="${JAVA_HOME}/bin:${PATH}"
```

* *bashrc*

```
export PS1="\[\033[1;34m\]\w $\[\033[0m\] "
export PS2="> "
```

If you created these on your desktop, now copy them into place using the following Terminal commands:

```
# Backup your existing bashrc & bash_profile
cp ~/.bashrc ~/bashrc.bak && cp ~/.bash_profile ~/bash_profile.bak

# Move the new bashrc and bash profile into place
mv -f ~/Desktop/bashrc.txt ~/.bashrc && mv -f ~/Desktop/bash_profile.txt ~/.bash_profile
```

Close your terminal & re-open it.  Now those Android paths are available.  But...

The `adb` and other android commands won't be available
until after the first run of the Android Studio project and we'll revisit to check.

## Bookmarks

As you develop for Android you'll acquire a huge list of reference bookmarks - its good
to start now by adding these go-to references to your bookmarks bar on your favourite
browser.  Build on these as you go through the course.

* [Google Kotlin Codelabs](https://codelabs.developers.google.com/android-kotlin-fundamentals/){:target="_blank"}
* [Google Kotlin RecyclerView CodeLab](https://codelabs.developers.google.com/codelabs/kotlin-android-training-recyclerview-fundamentals/#0){:target="_blank"}
* [Android Guide to App Architecture](https://developer.android.com/jetpack/docs/guide){:target="_blank"}
* [Google Play Console](https://play.google.com/apps/publish/){:target="_blank"}
* [Android Open Source Project](https://source.android.com){:target="_blank"}
* [Android Studio Keyboard Shortcuts](https://developer.android.com/studio/intro/keyboard-shortcuts){:target="_blank"}

Some useful URL's are also in the navigation panel left of the pages on this site.