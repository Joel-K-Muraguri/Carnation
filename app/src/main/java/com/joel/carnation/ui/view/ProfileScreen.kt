package com.joel.carnation.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.joel.carnation.ui.components.Avatar
import com.joel.carnation.ui.components.ProfileScreenActions
import com.joel.carnation.ui.theme.mainColor
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun ProfileScreen(navigator: DestinationsNavigator) {

    Surface {


        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(6.dp)
        ) {

            Avatar()

            ProfileScreenActions(
                modifier = Modifier
                    .padding(12.dp),
                navigator
            )

            Box(
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    text = "Version 1.0.1",
                    color = mainColor,
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                )
            }
        }

    }

}