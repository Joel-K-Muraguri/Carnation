package com.joel.carnation.model

import com.joel.carnation.R
import com.joel.carnation.ui.destinations.Destination
import com.joel.carnation.ui.destinations.HomeScreenDestination
import com.joel.carnation.ui.destinations.ProfileScreenDestination
import com.joel.carnation.ui.destinations.SearchScreenDestination

sealed class BottomNavItem(val title : String, val icon : Int, val destination : Destination){

    object Home: BottomNavItem(
        title = "Home",
        icon = R.drawable.ic_baseline_home_24,
        destination = HomeScreenDestination
    )

    object Search: BottomNavItem(
        title = "Search",
        icon = R.drawable.ic_baseline_search_24,
        destination = SearchScreenDestination
    )

    object Profile: BottomNavItem(
        title = "Profile",
        icon = R.drawable.ic_baseline_person_24,
        destination = ProfileScreenDestination
    )

}
