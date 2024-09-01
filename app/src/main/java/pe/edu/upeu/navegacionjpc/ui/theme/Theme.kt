package pe.edu.upeu.navegacionjpc.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

public val lightGreenScheme  =  lightColorScheme(
    primary = green_primaryLight,
    onPrimary = green_onPrimaryLight,
    primaryContainer = green_green_primaryContainerLight,
    onPrimaryContainer = green_onPrimaryContainerLight,
    secondary = green_secondaryLight,
    onSecondary = green_onSecondaryLight,
    secondaryContainer = green_secondaryContainerLight,
    onSecondaryContainer = green_onSecondaryContainerLight,
    tertiary = green_tertiaryLight,
    onTertiary = green_onTertiaryLight,
    tertiaryContainer = green_tertiaryContainerLight,
    onTertiaryContainer = green_onTertiaryContainerLight,
    error = green_errorLight,
    onError = green_onErrorLight,
    errorContainer = green_errorContainerLight,
    onErrorContainer = green_onErrorContainerLight,
    background = green_backgroundLight,
    onBackground = green_onBackgroundLight,
    surface = green_surfaceLight,
    onSurface = green_onSurfaceLight,
    surfaceVariant = green_surfaceVariantLight,
    onSurfaceVariant = green_onSurfaceVariantLight,
    outline = green_outlineLight,
    outlineVariant = green_outlineVariantLight,
    scrim = green_scrimLight,
    inverseSurface = green_inverseSurfaceLight,
    inverseOnSurface = green_inverseOnSurfaceLight,
    inversePrimary = green_inversePrimaryLight,
    surfaceDim = green_surfaceDimLight,
    surfaceBright = green_surfaceBrightLight,
    surfaceContainerLowest = green_surfaceContainerLowestLight,
    surfaceContainerLow = green_surfaceContainerLowLight,
    surfaceContainer = green_surfaceContainerLight,
    surfaceContainerHigh = green_surfaceContainerHighLight,
    surfaceContainerHighest = green_surfaceContainerHighestLight,
)

public val darkGreenScheme = darkColorScheme(
    primary = green_primaryLightMediumContrast,
    onPrimary = green_onPrimaryLightMediumContrast,
    primaryContainer = green_primaryContainerLightMediumContrast,
    onPrimaryContainer = green_onPrimaryContainerLightMediumContrast,
    secondary = green_secondaryLightMediumContrast,
    onSecondary = green_onSecondaryLightMediumContrast,
    secondaryContainer = green_secondaryContainerLightMediumContrast,
    onSecondaryContainer = green_onSecondaryContainerLightMediumContrast,
    tertiary = green_tertiaryLightMediumContrast,
    onTertiary = green_onTertiaryLightMediumContrast,
    tertiaryContainer = green_tertiaryContainerLightMediumContrast,
    onTertiaryContainer = green_onTertiaryContainerLightMediumContrast,
    error = green_errorLightMediumContrast,
    onError = green_onErrorLightMediumContrast,
    errorContainer = green_errorContainerLightMediumContrast,
    onErrorContainer = green_onErrorContainerLightMediumContrast,
    background = green_backgroundLightMediumContrast,
    onBackground = green_onBackgroundLightMediumContrast,
    surface = green_surfaceLightMediumContrast,
    onSurface = green_onSurfaceLightMediumContrast,
    surfaceVariant = green_surfaceVariantLightMediumContrast,
    onSurfaceVariant = green_onSurfaceVariantLightMediumContrast,
    outline = green_outlineLightMediumContrast,
    outlineVariant = green_outlineVariantLightMediumContrast,
    scrim = green_scrimLightMediumContrast,
    inverseSurface = green_inverseSurfaceLightMediumContrast,
    inverseOnSurface = green_inverseOnSurfaceLightMediumContrast,
    inversePrimary = green_inversePrimaryLightMediumContrast,
    surfaceDim = green_surfaceDimLightMediumContrast,
    surfaceBright = green_surfaceBrightLightMediumContrast,
    surfaceContainerLowest = green_surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = green_surfaceContainerLowLightMediumContrast,
    surfaceContainer = green_surfaceContainerLightMediumContrast,
    surfaceContainerHigh = green_surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = green_surfaceContainerHighestLightMediumContrast,
)

public val lightRedScheme = lightColorScheme(
    primary = red_primaryLight,
    onPrimary = red_onPrimaryLight,
    primaryContainer = red_primaryContainerLight,
    onPrimaryContainer = red_onPrimaryContainerLight,
    secondary = red_secondaryLight,
    onSecondary = red_onSecondaryLight,
    secondaryContainer = red_secondaryContainerLight,
    onSecondaryContainer = red_onSecondaryContainerLight,
    tertiary = red_tertiaryLight,
    onTertiary = red_onTertiaryLight,
    tertiaryContainer = red_tertiaryContainerLight,
    onTertiaryContainer = red_onTertiaryContainerLight,
    error = red_errorLight,
    onError = red_onErrorLight,
    errorContainer = red_errorContainerLight,
    onErrorContainer = red_onErrorContainerLight,
    background = red_backgroundLight,
    onBackground = red_onBackgroundLight,
    surface = red_surfaceLight,
    onSurface = red_onSurfaceLight,
    surfaceVariant = red_surfaceVariantLight,
    onSurfaceVariant = red_onSurfaceVariantLight,
    outline = red_outlineLight,
    outlineVariant = red_outlineVariantLight,
    scrim = red_scrimLight,
    inverseSurface = red_inverseSurfaceLight,
    inverseOnSurface = red_inverseOnSurfaceLight,
    inversePrimary = red_inversePrimaryLight,
    surfaceDim = red_surfaceDimLight,
    surfaceBright = red_surfaceBrightLight,
    surfaceContainerLowest = red_surfaceContainerLowestLight,
    surfaceContainerLow = red_surfaceContainerLowLight,
    surfaceContainer = red_surfaceContainerLight,
    surfaceContainerHigh = red_surfaceContainerHighLight,
    surfaceContainerHighest = red_surfaceContainerHighestLight,
)

public val darkRedScheme = darkColorScheme(
    primary = red_primaryLightMediumContrast,
    onPrimary = red_onPrimaryLightMediumContrast,
    primaryContainer = red_primaryContainerLightMediumContrast,
    onPrimaryContainer = red_onPrimaryContainerLightMediumContrast,
    secondary = red_secondaryLightMediumContrast,
    onSecondary = red_onSecondaryLightMediumContrast,
    secondaryContainer = red_secondaryContainerLightMediumContrast,
    onSecondaryContainer = red_onSecondaryContainerLightMediumContrast,
    tertiary = red_tertiaryLightMediumContrast,
    onTertiary = red_onTertiaryLightMediumContrast,
    tertiaryContainer = red_tertiaryContainerLightMediumContrast,
    onTertiaryContainer = red_onTertiaryContainerLightMediumContrast,
    error = red_errorLightMediumContrast,
    onError = red_onErrorLightMediumContrast,
    errorContainer = red_errorContainerLightMediumContrast,
    onErrorContainer = red_onErrorContainerLightMediumContrast,
    background = red_backgroundLightMediumContrast,
    onBackground = red_onBackgroundLightMediumContrast,
    surface = red_surfaceLightMediumContrast,
    onSurface = red_onSurfaceLightMediumContrast,
    surfaceVariant = red_surfaceVariantLightMediumContrast,
    onSurfaceVariant = red_onSurfaceVariantLightMediumContrast,
    outline = red_outlineLightMediumContrast,
    outlineVariant = red_outlineVariantLightMediumContrast,
    scrim = red_scrimLightMediumContrast,
    inverseSurface = red_inverseSurfaceLightMediumContrast,
    inverseOnSurface = red_inverseOnSurfaceLightMediumContrast,
    inversePrimary = red_inversePrimaryLightMediumContrast,
    surfaceDim = red_surfaceDimLightMediumContrast,
    surfaceBright = red_surfaceBrightLightMediumContrast,
    surfaceContainerLowest = red_surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = red_surfaceContainerLowLightMediumContrast,
    surfaceContainer = red_surfaceContainerLightMediumContrast,
    surfaceContainerHigh = red_surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = red_surfaceContainerHighestLightMediumContrast,
)
enum class ThemeType{RED, GREEN}


@Composable
fun NavegacionJPCTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    colorScheme: ColorScheme,
    content: @Composable () -> Unit
) {
    /*val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }*/

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}