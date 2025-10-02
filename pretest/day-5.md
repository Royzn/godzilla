### Test on Making Network Calls with HTTP using Retrofit

#### **Optional Questions:**

1. What is Retrofit used for in Android?

   - a) Data storage
   - b) HTTP calls **<- Answer**
   - c) UI updates
   - d) Bluetooth communication
   - e) None of the above

2. Which HTTP method is used to send data to a server?

   - a) GET
   - b) POST **<- Answer**
   - c) DELETE
   - d) PATCH
   - e) None of the above

3. What is the return type of Retrofit’s API calls?

   - a) JSON
   - b) Call object **<- Answer**
   - c) Response object
   - d) String
   - e) None of the above

4. How do you define a base URL in Retrofit?

   - a) `setBaseURL()`
   - b) `withURL()`
   - c) `baseURL()`
   - d) `@BaseURL`
   - e) None of the above **<- Answer**

5. Which library is often used with Retrofit for parsing JSON responses?
   - a) Moshi **<- Answer**
   - b) SQLite
   - c) OkHttp 
   - d) Volley
   - e) None of the above

---

#### **True/False Questions:**

1. Retrofit supports both synchronous and asynchronous API requests. **TRUE**
2. Retrofit cannot handle different HTTP methods like GET, POST, PUT, and DELETE. **FALSE**
3. Retrofit can convert JSON responses into Java/Kotlin objects automatically. **TRUE**
4. Retrofit automatically retries failed network requests. **FALSE**
5. The `@GET` annotation in Retrofit is used for sending data to a server. **FALSE**

---

#### **Short Answer Questions:**

1. What is the purpose of using `GsonConverterFactory` in Retrofit?
   To convert JsonResponse to Java/Kotlin using Gson library
2. How do you make an asynchronous network call with Retrofit?
   ```kotlin
   val call = apiService.getUser()
   call.enqueue(object : Callback<User> {
      override fun onResponse(call: Call<User>, response: Response<User>) {
         if (response.isSuccessful) {
            val user = response.body()
            // Handle success
           } else {
            // Handle server error
           }
       }

       override fun onFailure(call: Call<User>, t: Throwable) {
        // Handle failure
    }
   ```
3. What is the difference between synchronous and asynchronous API calls in Retrofit?
   Sync will block the current thread while async will run on background thread.
   
4. How do you pass query parameters to a Retrofit API method?
   ```kotlin
   @GET("users")
   Call<List<User>> getUsersByAge(@Query("age") int age);
   ```

5. Explain how error handling works in Retrofit when a network request fails.
   we can do onFailure method inside call.enqueue to define what should Retrofit do if network request fails.

---

#### **Code Fix Questions:**

1. **Incorrect code:**

   ```kotlin
   @GET("users")
   fun getUsers(): Call<List<User>> {
       return retrofit.execute()
   }
   ```

   **Corrected Code:**

   ```kotlin
   interface ApiService {
      @GET("users")
      fun getUsers(): Call<List<User>>
   }

   val retrofit = Retrofit.Builder()
    .baseUrl("https://api.example.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

   val apiService = retrofit.create(ApiService::class.java)

   // Call the API asynchronously
   apiService.getUsers().enqueue(object : Callback<List<User>> {
    override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
        if (response.isSuccessful) {
            val users = response.body()
            // Handle users
        } else {
            // Handle error
        }
    }

    override fun onFailure(call: Call<List<User>>, t: Throwable) {
        // Handle failure
    }
   })
   ```

   **Fix the code to correctly make the network request.**

2. **Incorrect code:**

   ```kotlin
   @POST("login")
   fun loginUser(@Body credentials: Map<String, String>): Call<LoginResponse>
   val response = loginUser("username", "password")
   ```

   **Corrected Code:**
   ```kotlin
   interface ApiService {
    @POST("login")
    fun loginUser(@Body credentials: Map<String, String>): Call<LoginResponse>
   }

   val credentials = mapOf(
    "username" to "yourUsername",
    "password" to "yourPassword"
   )

   val call = apiService.loginUser(credentials)

   call.enqueue(object : Callback<LoginResponse> {
    override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
        if (response.isSuccessful) {
            val loginResponse = response.body()
            // Handle success
        } else {
            // Handle error (e.g. wrong credentials)
        }
    }

    override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
        // Handle network failure
    }
   })
   ```

   **Fix the code to properly pass the parameters to the POST request.**

3. **Incorrect code:**
   ```kotlin
   @GET("user/{id}")
   fun getUserById(@Path("id") userId: Int): Call<User>
   getUserById(123).execute()
   ```

   **Corrected Code:**
   ```kotlin
   interface ApiService {
    @GET("user/{id}")
    fun getUserById(@Path("id") userId: Int): Call<User>
   }

   val retrofit = Retrofit.Builder()
    .baseUrl("https://api.example.com/") // Use your real base URL
    .addConverterFactory(GsonConverterFactory.create())
    .build()

   val apiService = retrofit.create(ApiService::class.java)

   ```
   **Fix the code to correctly fetch the user with the given ID asynchronously.**

---

#### MULTIMEDIA

#### **Optional Questions:**

1. Which class is used to play audio files in Android?

   - a) `AudioPlayer`
   - b) `MediaRecorder`
   - c) `MediaPlayer` **<- Answer**
   - d) `AudioRecorder`
   - e) `VideoView`

2. What is the purpose of `VideoView` in Android?

   - a) To display and play audio files
   - b) To capture videos from the camera
   - c) To play video content **<- Answer**
   - d) To stream live video
   - e) None of the above

3. How do you capture images using the camera in Android?

   - a) Using `Intent.ACTION_IMAGE_CAPTURE` **<- Answer**
   - b) Using `Intent.ACTION_VIDEO_CAPTURE`
   - c) Using `MediaRecorder`
   - d) Using `ImageView`
   - e) None of the above

4. Which class is used for recording audio in Android?

   - a) `MediaPlayer`
   - b) `MediaRecorder` **<- Answer**
   - c) `AudioRecorder`
   - d) `AudioCapture`
   - e) `SoundPlayer`

5. What is the role of `setVideoURI()` in `VideoView`?
   - a) To start recording video
   - b) To set the path of the video to be played **<- Answer**
   - c) To play audio content
   - d) To control audio playback
   - e) None of the above

---

#### **True/False Questions:**

1. `MediaPlayer` is used for both playing and recording audio. **FALSE**
2. The `VideoView` class requires a `MediaController` to play videos. **FALSE**
3. You need runtime permissions to access the device's microphone or camera. **TRUE**
4. The `MediaRecorder` class can be used to capture both audio and video. **TRUE**
5. `ImageView` is used to capture images from the camera in Android. **FALSE**

---

#### **Short Answer Questions:**

1. What is the purpose of `MediaPlayer` in Android?
   it handles playback of media from various sources and supports video format
2. How do you display and play a video in an Android app using `VideoView`?
   we need to add VideoView first. then, we bind it and set the URI of the content. 
3. Explain the process of capturing images using the camera in Android.
   we need to request camera permission first. after that, we create camera intent. then, we can override onActivityResult to handle captured image
4. What permissions are required to record audio in an Android app?
   we can put this code `<uses-permission android:name="android.permission.RECORD_AUDIO" />` inside AndroidManifest.xml
5. How can you play an audio file stored in the device’s raw resource directory?
   we need to add the raw resource to res/raw/ path. then we can call it with this line of codes
   ```kotlin
   val mediaPlayer = MediaPlayer.create(this, R.raw.sound)
   mediaPlayer.start()
   ```

---

#### **Code Fix Questions:**

1. **Incorrect code:**

   ```kotlin
   val mediaPlayer = MediaPlayer()
   mediaPlayer.setAudioSource("audio.mp3")
   mediaPlayer.start()
   ```

   **Corrected Code:**
   ```kotlin
   val mediaPlayer = MediaPlayer()
   mediaPlayer.setDataSource("/sdcard/Music/audio.mp3") // or use a valid file path
   mediaPlayer.prepare()
   mediaPlayer.start()
   ```

   **Fix the code to correctly load and play an audio file using `MediaPlayer`.**

2. **Incorrect code:**

   ```kotlin
   val videoView: VideoView = findViewById(R.id.videoView)
   videoView.setVideoPath("video.mp4")
   videoView.play()
   ```

   **Corrected Code:**
   ```kotlin
   val videoView: VideoView = findViewById(R.id.videoView)
   val path = "/sdcard/Movies/video.mp4"
   videoView.setVideoPath(path)
   videoView.start()
   ```

   **Fix the code to correctly set and start video playback in a `VideoView`.**

4. **Incorrect code:**
   ```kotlin
   val intent = Intent(MediaRecorder.ACTION_IMAGE_CAPTURE)
   startActivityForResult(intent, 1)
   ```

   **Corrected Code:**
   ```kotlin
   val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
   startActivityForResult(intent, 1)
   ```
   **Fix the code to correctly capture an image using the camera intent.**

---
