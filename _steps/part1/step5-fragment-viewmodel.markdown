---
layout: step
number: 5
part: 1
title: Fragment and ViewModel
permalink: step5/

#keywords:
#  - term:
#    define:

---

To display your data in a RecyclerView, you need the following parts:

Data to display.
A RecyclerView instance defined in your layout file, to act as the container for the views.
A layout for one item of data.
If all the list items look the same, you can use the same layout for all of them, but that is not mandatory. The item layout has to be created separately from the fragment's layout, so that one item view at a time can be created and filled with data.
A layout manager.
The layout manager handles the organization (the layout) of UI components in a view.
A view holder.
The view holder extends the ViewHolder class. It contains the view information for displaying one item from the item's layout. View holders also add information that RecyclerView uses to efficiently move views around the screen.
An adapter.
The adapter connects your data to the RecyclerView. It adapts the data so that it can be displayed in a ViewHolder. A RecyclerView uses the adapter to figure out how to display the data on the screen.
