package com.joel.carnation.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.joel.carnation.model.BottomNavItem
import com.joel.carnation.ui.theme.mainColor

@Composable
fun StandardScaffold(
    navController: NavController,
    showBottomBar : Boolean = true,
    items : List<BottomNavItem> = listOf(
        BottomNavItem.Home,
        BottomNavItem.Search,
        BottomNavItem.Profile,
    ),
    content : @Composable  (paddingValues : PaddingValues) -> Unit
){

    Scaffold(
        bottomBar = {
            if (showBottomBar){
                BottomNavigation(
                    elevation = 5.dp,
                    backgroundColor = Color.White,
                    contentColor = Color.White
                ) {
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    val currentDestination = navBackStackEntry?.destination
                    items.forEach { screen ->
                        BottomNavigationItem(
                            selected = currentDestination?.route?.contains(screen.destination.route) == true,
                            onClick = {
                                      navController.navigate(screen.destination.route){
                                          navController.graph.startDestinationRoute?.let { bottom_route ->
                                              popUpTo(bottom_route){
                                                  saveState = true
                                              }
                                          }
                                          launchSingleTop = true
                                          restoreState = true
                                      }
                            },
                            icon = {
                                Icon(
                                    painter = painterResource(id = screen.icon),
                                    contentDescription = screen.title)
                            },
                            selectedContentColor = mainColor,
                            unselectedContentColor = Color.LightGray,
                            alwaysShowLabel = true,
                            label = {
                                Text(text = screen.title)
                            }
                        )
                    }
                }
            }
        }
    )
    { innerPadding ->
        content(innerPadding)
    }
}