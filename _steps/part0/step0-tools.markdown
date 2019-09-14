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

<script>
console.log('oh hey there!')
</script>

One of the really nice things about Javascript (and web design in general really) is how little you need to get started.  

There are many, many tools that you *can* learn, which can make things easier when you start to build bigger more complex applications - but you don't actually need them.

The only two things you really need are:

1. an editor
2. a web browser and its developer tools.

## Your Editor

The first thing you need is an *editor* to write your Javascript source code in.

However since we don't have time to download and install editor tools in this workshop, you'll start out by 
using an online code editor & server in one called [Glitch](http://glitch.me){:target="_blank"}.

When you get started writing code on your own, you'll want to move to an editor that you download and install on
your local computer.  Microsoft Word and the like won't work as servers & web-browsers cannot understand the special
characters that those programs insert into your work.

Luckily there are some great code editors available for free.  If you are just getting started we recommend [Brackets](http://brackets.io/){:target="_blank"}.  Brackets is free, open-source, and available for Windows, macOS, and Linux.  There's also [Visual Studio Code](https://code.visualstudio.com/Download){:target="_blank"} by Microsoft and many others. 


## WebBrowser Developer Tools

Since you're viewing this webpage, we are going to assume you already have a web browser.  :smile:

All of the modern mainstream web browsers (Chrome, Firefox, Safari, Internet Explorer, Edge) include their own set of Developer Tools AKA Dev Tools.  

Dev Tools provide you a way to see what is going on behind the scenes in whatever web page you currently have open in the browser.

Browser Dev Tools are useful for:

1. Trying to figure out why your page isn't doing the thing you expect it to do (AKA debugging)
2. Checking out the code that makes up other people's web pages to learn how they did a particular thing.

Different browsers generally cover the same basic functionality with their Dev Tools, but they each do it in their own way with slightly different interfaces and with some features unique to themselves.  

#### Opening Dev Tools

Depending on your browser of choice, the way to open the Dev Tools will be a little different.  But there will generally be a menu item somewhere in addition to keyboard shortcuts.  

The Dev Tools open in a new panel that is attached ("docked") to your current browser tab.  This panel will usually have a set of tabs for different features and a couple of controls for closing it, switching between being docked horizontally or vertically, and detaching into a completely separate window.

##### Chrome

Click on the Menu icon, select More Tools, and then Developer Tools.  Or press `ctrl-shift-i`.

##### Firefox

Click on the Menu icon, select Web Developer, and then Toggle Tools.  Or press `ctrl-shift-i`.

##### Safari

Safari's Dev Tools are disabled by default. To enable them go to Safari's Preferences and enable it on the Advanced tab.

Then you will be able to access the Dev Tools using the Develop menu.

##### Internet Explorer & Microsoft Edge

Press the `F12` button on your keyboard while you are in Internet Explorer or Microsoft Edge. This might not work if your F keys are bound to other functions like volume or media control - in this case, you need to press `fn-F12`.

If you are feeling a little overwhelmed by the Dev Tools, don't worry.  We are only really going to use one Dev Tools feature today: the console.  

The console is used to display messages, including errors.  When debugging you will frequently make use of the console to display information to help you.

<h3><i class="fa fa-hand-pointer-o " aria-hidden="true"></i> Your first practical exercise!</h3>

Open your Dev Tools on this page (the one you're reading right now), and go to the Console tab.  

You should see the message `oh hey there!` which is from a little bit of JavaScript in this page, which looks 
like this: 

<tt>console.log('oh hey there!')</tt>

You can also run JavaScript commands by typing them directly into the console.

Type the following into the console and press enter to see a lovely (or not) shade of green.

```JavaScript
document.body.style["background-color"] = '#86ff4a'
```

Neat.

Now refresh the page and you will see the original page again.

What you did with that command was modify the copy of the webpage that your browser had.  Refreshing the page causes the browser to get a fresh new copy of it.

Important to note that any changes made to a page in the Dev Tools exist in that tab in the browser.  They will not be saved back to the original.
