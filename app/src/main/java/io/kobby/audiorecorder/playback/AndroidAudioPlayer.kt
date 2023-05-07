package io.kobby.audiorecorder.playback

import android.content.Context
import android.media.MediaPlayer
import android.net.Uri
import java.io.File

class AndroidAudioPlayer(val context: Context):AudioPlayer {
    private var player:MediaPlayer?=null

    override fun playFile(file: File) {
      MediaPlayer.create(context, Uri.fromFile(file)).apply {
          player =this
          start()
      }
    }

    override fun stop() {
        player?.stop()
        player?.release()
        player = null
    }
}