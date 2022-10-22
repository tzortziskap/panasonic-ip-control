package com.isikapevision.tvremotecontrol.enums;

import java.util.Arrays;

public enum PanasonicCommands {
    
    //-------------
    // Basic commands
    //-------------
    NRC_POWER_ONOFF("power", "NRC_POWER-ONOFF"), // Power off
    NRC_MENU_ONOFF("menu", "NRC_MENU-ONOFF"), // Menu
    NRC_3D_ONOFF("3d", "NRC_3D-ONOFF"), // 3D button
    NRC_ENTER_ONOFF("ok", "NRC_ENTER-ONOFF"), // Control Center click / enter
    NRC_RETURN_ONOFF("back", "NRC_RETURN-ONOFF"), // Return
    NRC_SUBMENU_ONOFF("option", "NRC_SUBMENU-ONOFF"), // Option
    NRC_CANCEL_ONOFF("cancel", "NRC_CANCEL-ONOFF"), // Cancel / Exit
    NRC_APPS_ONOFF("apps", "NRC_APPS-ONOFF"),
    NRC_HOME_ONOFF("home", "NRC_HOME-ONOFF"),
    NRC_GUIDE_ONOFF("guide", "NRC_EPG-ONOFF"), // Guide / EPG
    
    //-------------
    // Input
    //-------------
    NRC_TV_ONOFF("tv", "NRC_TV-ONOFF"), // TV
    NRC_CHG_INPUT_ONOFF("av", "NRC_CHG_INPUT-ONOFF"), // AV("")

    //-------------
    // Controls
    //-------------
    NRC_UP_ONOFF("up", "NRC_UP-ONOFF"), // Control UP
    NRC_DOWN_ONOFF("down", "NRC_DOWN-ONOFF"), // Control DOWN
    NRC_LEFT_ONOFF("left", "NRC_LEFT-ONOFF"), // Control LEFT
    NRC_RIGHT_ONOFF("right", "NRC_RIGHT-ONOFF"), // Control RIGHT

    //-------------
    // Volume
    //-------------
    NRC_VOLUP_ONOFF("plus", "NRC_VOLUP-ONOFF"), // volume up
    NRC_VOLDOWN_ONOFF("minus", "NRC_VOLDOWN-ONOFF"), // volume down
    NRC_MUTE_ONOFF("mute", "NRC_MUTE-ONOFF"), // mute
    
    //-------------
    // Channels
    //-------------
    NRC_CH_DOWN_ONOFF("ch-down", "NRC_CH_DOWN-ONOFF"), // channel down
    NRC_CH_UP_ONOFF("ch-up", "NRC_CH_UP-ONOFF"), // channel up

    //-------------
    // Player
    //-------------
    NRC_REW_ONOFF("rew", "NRC_REW-ONOFF"), // rewind
    NRC_PLAY_ONOFF("play", "NRC_PLAY-ONOFF"), // play
    NRC_FF_ONOFF("ff", "NRC_FF-ONOFF"), // fast-forward
    NRC_SKIP_PREV_ONOFF("prev", "NRC_SKIP_PREV-ONOFF"), // skip previous
    NRC_PAUSE_ONOFF("pause", "NRC_PAUSE-ONOFF"), // pause
    NRC_SKIP_NEXT_ONOFF("next", "NRC_SKIP_NEXT-ONOFF"), // skip next
    NRC_STOP_ONOFF("stop", "NRC_STOP-ONOFF"), // stop
    NRC_REC_ONOFF("rec", "NRC_REC-ONOFF"), // record
    
    //-------------
    // Numbers
    //-------------
    // numeric buttons
    NRC_D1_ONOFF("1", "NRC_D1-ONOFF"),
    NRC_D2_ONOFF("2", "NRC_D2-ONOFF"),
    NRC_D3_ONOFF("3", "NRC_D3-ONOFF"),
    NRC_D4_ONOFF("4","NRC_D4-ONOFF"),
    NRC_D5_ONOFF("5","NRC_D5-ONOFF"),
    NRC_D6_ONOFF("6","NRC_D6-ONOFF"),
    NRC_D7_ONOFF("7","NRC_D7-ONOFF"),
    NRC_D8_ONOFF("8","NRC_D8-ONOFF"),
    NRC_D9_ONOFF("9","NRC_D9-ONOFF"),
    NRC_D0_ONOFF("0","NRC_D0-ONOFF"),

    //-------------
    // Color buttons
    //-------------
    NRC_RED_ONOFF("red", "NRC_RED-ONOFF"), // red
    NRC_GREEN_ONOFF("green", "NRC_GREEN-ONOFF"), // green
    NRC_YELLOW_ONOFF("yellow", "NRC_YELLOW-ONOFF"), // yellow
    NRC_BLUE_ONOFF("blue", "NRC_BLUE-ONOFF"), // blue
    
    NRC_VTOOLS_ONOFF("vtools", "NRC_VTOOLS-ONOFF"), // VIERA tools
    NRC_SD_CARD_ONOFF("sd-card", "NRC_SD_CARD-ONOFF"), // SD_card
    NRC_DISP_MODE_ONOFF("disp-mode", "NRC_DISP_MODE-ONOFF"), // Display mode / Aspect ratio
    NRC_INTERNET_ONOFF("internet", "NRC_INTERNET-ONOFF"), // VIERA connect
    NRC_VIERA_LINK_ONOFF("viera-link", "NRC_VIERA_LINK-ONOFF"), // VIERA link
    NRC_TEXT_ONOFF("text", "NRC_TEXT-ONOFF"), // Text / TTV
    NRC_STTL_ONOFF("sttl", "NRC_STTL-ONOFF"), // STTL / Subtitles
    NRC_INFO_ONOFF("info", "NRC_INFO-ONOFF"), // info
    NRC_INDEX_ONOFF("index", "NRC_INDEX-ONOFF"), // TTV index
    NRC_HOLD_ONOFF("hold", "NRC_HOLD-ONOFF"), // TTV hold / image freeze
    NRC_R_TUNE_ONOFF("r-tune", "NRC_R_TUNE-ONOFF"), // Last view
    NRC_P_NR_ONOFF("p-nr", "NRC_P_NR-ONOFF"), // P_NR (Noise reduction)
    NRC_OFFTIMER_ONOFF("offtimer", "NRC_OFFTIMER-ONOFF"), // off timer
//    NRC_R_TUNE_ONOFF("", "NRC_R_TUNE-ONOFF"), // Seems to do the same as INFO
    NRC_CHG_NETWORK_ONOFF("chg-network", "NRC_CHG_NETWORK-ONOFF"),
    NRC_CC_ONOFF("cc", "NRC_CC-ONOFF"),
    NRC_SAP_ONOFF("sap", "NRC_SAP-ONOFF"),
    NRC_RECLIST_ONOFF("reclist", "NRC_RECLIST-ONOFF"),
    NRC_DRIVE_ONOFF("drive", "NRC_DRIVE-ONOFF"),
    NRC_DATA_ONOFF("data", "NRC_DATA-ONOFF"),
    NRC_BD_ONOFF("bd", "NRC_BD-ONOFF"),
    NRC_FAVORITE_ONOFF("favorite", "NRC_FAVORITE-ONOFF"),
    NRC_DIGA_CTL_ONOFF("diga-ctl", "NRC_DIGA_CTL-ONOFF"),
    NRC_VOD_ONOFF("vod", "NRC_VOD-ONOFF"),
    NRC_ECO_ONOFF("eco", "NRC_ECO-ONOFF"),
    NRC_GAME_ONOFF("game", "NRC_GAME-ONOFF"),
    NRC_EZ_SYNC_ONOFF("ez-sync", "NRC_EZ_SYNC-ONOFF"),
    NRC_PICTAI_ONOFF("pictai", "NRC_PICTAI-ONOFF"),
    NRC_MPX_ONOFF("mpx", "NRC_MPX-ONOFF"),
    NRC_SPLIT_ONOFF("split", "NRC_SPLIT-ONOFF"),
    NRC_SWAP_ONOFF("swap", "NRC_SWAP-ONOFF"),
    NRC_R_SCREEN_ONOFF("r-screen", "NRC_R_SCREEN-ONOFF"),
    NRC_30S_SKIP_ONOFF("30s-skip", "NRC_30S_SKIP-ONOFF"),
    NRC_PROG_ONOFF("prog", "NRC_PROG-ONOFF"),
    NRC_TV_MUTE_ON_ONOFF("tv-mute-on", "NRC_TV_MUTE_ON-ONOFF"),
    NRC_TV_MUTE_OFF_ONOFF("tv-mute-off", "NRC_TV_MUTE_OFF-ONOFF");


    PanasonicCommands(String friendlyCommand, String command) {
        this.friendlyCommand = friendlyCommand;
        this.command = command;
    }

    private final String command;

    private final String friendlyCommand;

    public String getCommand() {
        return command;
    }

    public String getFriendlyCommand() {
        return friendlyCommand;
    }

    public static PanasonicCommands findByFriendlyCommand(String friendlyCommand) {
        return Arrays.stream(values())
                .filter(p -> p.getFriendlyCommand().equals(friendlyCommand))
                .findFirst()
                .orElse(null);
    }
}
