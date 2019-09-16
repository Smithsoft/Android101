---
layout: home
number: start
---

{% include Android_robot.html %}

## What is this?

This is an introductory level workshop on Android development.  

## What is Android?

Android is a mobile operating system developed by Google.  In this course it is the name for the eco-system of software libraries, toolchains and platforms that make up the a mobile device development environment.  

At the base Android relies on a modified version of the Linux kernel and other open source software, and on top of that is a managed runtime.  In 2013 (Android KitKat) the [Dalvik runtime was superseded by the "Android Runtime"](https://source.android.com/devices/tech/dalvik).  Both systems run special application binary files containing virtual machine bytecode encoded in the "DEX" (Dalvik Executable) format.  

Android devices ship with much application sofware running on Dalvik or ART, such as the 
launcher which provides a UI for opening apps & files.

The Android runtime also supports 3rd party Android applications, which are delivered as APK packages from the Google Play store and other package hosting sites.

## What is Kotlin?

Kotlin is a cross-platform statically typed programming language first developed in 2011 by
east-European software company JetBrains, makers of the IntelliJ code editor.  It was in
2017 promoted & supported by Google as a language for Android development.  As of today in
Android [Kotlin is preferred by Google](https://developer.android.com/kotlin) as a first 
class development language overtaking the venerable but more verbose Java language.  

Kotlin does have a compiler backend that can target native platform specific binaries; for
it to produce DEX files and interoperate with Java, Kotlin in Android Studio relies on the 
Java Virtual Machine.  

## Thanks & Credits

This workshop format was originally developed by folks from [Muses JS](musescodejs.org) previously known as [Nodegirls](http://nodegirls.com.au/).

The content of this is OpenSource and utilises Open Source resources published by Google but also by folks not sponsored by corporates who have released their work under Open Sourced licenses.  Their hard work is appreciated.

This workshop was developed by [Sarah Smith](http://github.com/sarah-j-smith) for the "Android 101" first devivered at Expedia in 2019.  It
is available under the [Apache 2.0 License](https://github.com/Smithsoft/Android101/blob/master/LICENSE){:target="_blank"}.

The Android robot is reproduced or modified from work created and [shared by Google](  https://developer.android.com/distribute/marketing-tools/brand-guidelines.html) and used according to terms described in the [Creative Commons 3.0 Attribution License](  https://developer.android.com/distribute/marketing-tools/brand-guidelines.html).