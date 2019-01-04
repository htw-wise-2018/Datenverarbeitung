package com.example.app.model

case class Coordinates(longitude: Double, latitude: Double) {
  def getLongitude: Double = longitude
  def getLatitude: Double = latitude
}
