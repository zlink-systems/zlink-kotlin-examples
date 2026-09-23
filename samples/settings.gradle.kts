pluginManagement {
    plugins {
        id("com.google.protobuf") version "0.9.4"
    }
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "zlink-framework-java-samples"

apply(from = settingsDir.resolve("gradle/zlink-sample-dependencies.settings.gradle.kts"))

include(
    ":kotlin:Bingo:Client",
    ":kotlin:Bingo:Server:Api",
    ":kotlin:Bingo:Server:Configuration",
    ":kotlin:Bingo:Server:Matchmaking",
    ":kotlin:Bingo:Server:Play",
    ":kotlin:Bingo:Server:Session",
    ":kotlin:Bingo:Shared",
    ":kotlin:DeliveryDispatch:Client",
    ":kotlin:DeliveryDispatch:Server:Configuration",
    ":kotlin:DeliveryDispatch:Server:CourierSession",
    ":kotlin:DeliveryDispatch:Server:CourierSpotNode",
    ":kotlin:DeliveryDispatch:Server:CustomerGateway",
    ":kotlin:DeliveryDispatch:Server:Dispatch",
    ":kotlin:DeliveryDispatch:Server:Tracking",
    ":kotlin:DeliveryDispatch:Shared",
    ":kotlin:GameQuest:Client",
    ":kotlin:GameQuest:Server:Configuration",
    ":kotlin:GameQuest:Server:GameApi",
    ":kotlin:GameQuest:Server:QuestMission",
    ":kotlin:GameQuest:Shared",
    ":kotlin:ShoppingMall:Client",
    ":kotlin:ShoppingMall:Server:CommerceApi",
    ":kotlin:ShoppingMall:Server:Configuration",
    ":kotlin:ShoppingMall:Server:OrderWorkflow",
    ":kotlin:ShoppingMall:Shared",
    ":kotlin:TicTacToe:Client",
    ":kotlin:TicTacToe:Server",
    ":kotlin:TicTacToe:Shared",
    ":kotlin:SupportChat:Client",
    ":kotlin:SupportChat:Server:Api",
    ":kotlin:SupportChat:Server:Configuration",
    ":kotlin:SupportChat:Server:Session",
    ":kotlin:SupportChat:Server:Support",
    ":kotlin:SupportChat:Shared",
    ":kotlin:ZoneWorld:Client",
    ":kotlin:ZoneWorld:Server",
    ":kotlin:ZoneWorld:Shared",
)
