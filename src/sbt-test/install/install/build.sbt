import aether.AetherKeys._

version := "0.1"

name := "deploy-file"

organization := "deploy-file"

scalaVersion := "2.9.1"

overridePublishLocalSettings

aetherLocalRepo := file(".") / "target" / "repo"
