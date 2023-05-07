package io.kobby.audiorecorder.record

import java.io.File

interface AudioRecorder {
    fun start(outputFile: File)
    fun stop()
}