package com.joel.carnation.ui.components

import android.widget.Toast
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joel.carnation.R
import com.joel.carnation.ui.destinations.*
import com.joel.carnation.ui.theme.mainColor
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
fun ProfileScreenActions(
    modifier: Modifier = Modifier,
    navigator: DestinationsNavigator
){

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(24.dp)
    ) {
        EditProfile(navigator)
        FavouriteAction(navigator)
        HistoryAction(navigator)
        SettingsAction(navigator)
        LogoutAction(navigator)

        Spacer(modifier = Modifier.height(30.dp))



    }

}

@Composable
fun EditProfile(
    navigator: DestinationsNavigator
){

    val context = LocalContext.current

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

   // Use the state to change the background color
    val color = if (isPressed) mainColor else Color.White

    Button(
        onClick = {
                  navigator.navigate(EditProfileScreenDestination)
        },
        modifier = Modifier
            .padding(12.dp),
        interactionSource = interactionSource,
        colors= ButtonDefaults.buttonColors(
            backgroundColor = color,
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(20.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_baseline_person_24), contentDescription = "person")
            Spacer(modifier = Modifier.width(30.dp))
            Text(
                text = "Profile",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
        }
    }
}

@Composable
fun FavouriteAction(
    navigator: DestinationsNavigator
){

    val context = LocalContext.current

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    // Use the state to change the background color
    val color = if (isPressed) mainColor else Color.White

    Button(
        onClick = {
            navigator.navigate(FavouritesScreenDestination)
        },
        modifier = Modifier
            .padding(12.dp),
        interactionSource = interactionSource,
        colors= ButtonDefaults.buttonColors(
            backgroundColor = color,
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(20.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_favorite_24),
                contentDescription = "person",
                tint = Color.Red
            )
            Spacer(modifier = Modifier.width(30.dp))
            Text(
                text = "Favourites",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
        }
    }
}

@Composable
fun HistoryAction(
    navigator: DestinationsNavigator
){

    val context = LocalContext.current

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    // Use the state to change the background color
    val color = if (isPressed) mainColor else Color.White

    Button(
        onClick = {
            navigator.navigate(HistoryScreenDestination)
        },
        modifier = Modifier
            .padding(12.dp),
        interactionSource = interactionSource,
        colors= ButtonDefaults.buttonColors(
            backgroundColor = color,
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(20.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_baseline_history_24), contentDescription = "hsitory")
            Spacer(modifier = Modifier.width(30.dp))
            Text(
                text = "History",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
        }
    }
}

@Composable
fun SettingsAction(
    navigator: DestinationsNavigator
){

    val context = LocalContext.current

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    // Use the state to change the background color
    val color = if (isPressed) mainColor else Color.White

    Button(
        onClick = {
            navigator.navigate(SettingsScreenDestination)
        },
        modifier = Modifier
            .padding(12.dp),
        interactionSource = interactionSource,
        colors= ButtonDefaults.buttonColors(
            backgroundColor = color,
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(20.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_baseline_settings_24), contentDescription = "settings")
            Spacer(modifier = Modifier.width(30.dp))
            Text(
                text = "Settings",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
        }
    }
}

@Composable
fun LogoutAction(
    navigator: DestinationsNavigator
){

    val context = LocalContext.current

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    // Use the state to change the background color
    val color = if (isPressed) mainColor else Color.White

    Button(
        onClick = {
            navigator.navigate(LogoutScreenDestination)
        },
        modifier = Modifier
            .padding(12.dp),
        interactionSource = interactionSource,
        colors= ButtonDefaults.buttonColors(
            backgroundColor = color,
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(20.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_baseline_logout_24), contentDescription = "logout")
            Spacer(modifier = Modifier.width(30.dp))
            Text(
                text = "Logout",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
        }
    }
}



