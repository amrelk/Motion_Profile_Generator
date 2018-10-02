package com.mammen.ui.javafx.settings;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Settings
{
    private BooleanProperty showCenterPath;
    private StringProperty backgroundImage;

    public void Settings()
    {
        showCenterPath = new SimpleBooleanProperty( false );
        backgroundImage = new SimpleStringProperty( null );
    }

    public boolean getShowCenterPath()
    {
        return showCenterPath.get();
    }

    public void setShowCenterPath( boolean show )
    {
        showCenterPath.set( show );
    }
}
