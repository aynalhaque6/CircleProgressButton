# CircleProgressButton
Simple Circle Progress Button
> Step 1. Add the JitPack repository to your build file
> Add it in your root build.gradle at the end of repositories:
```gradle
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```
> Step 2. Add the dependency
```gradle
dependencies {
	        implementation 'com.github.aynalhaque6:CircleProgressButton:1.0'
	}
```
> Usage
```gradle 
  <com.codecollection.circleprogressbutton.CircleProgressButton
        android:layout_width="75dp"
        android:layout_height="75dp" />
```
> For additional images changes
```gradle
app:imageBackground="@drawable/circle_background"
app:progressDrawable="@drawable/progress_drawable"
app:imageSrc="@drawable/press"
```
