package it.sephiroth.android.library.bottomnavigation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;

/**
 * Created by alessandro on 4/3/16.
 */
public class BottomNavigationItem {
    private final int id;
    private final int iconResource;
    private String title;
    private int color;
    private boolean enabled;
    private boolean visible = true;

    public BottomNavigationItem(final int id, final int iconResource, final String title) {
        this.id = id;
        this.iconResource = iconResource;
        this.title = title;
        this.enabled = true;
    }

    protected Drawable getIcon(Context context) {
        return AppCompatResources.getDrawable(context, this.iconResource);
    }

    protected String getTitle() {
        return title;
    }

    public void setColor(final int color) {
        this.color = color;
    }

    public boolean hasColor() {
        return color != 0;
    }

    public int getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public String toString() {
        return "BottomNavigationItem{"
            + "id=" + id
            + ", iconResource=" + String.format("%x", iconResource)
            + ", title='" + title + '\''
            + ", color=" + String.format("%x", color)
            + ", enabled=" + enabled
            + '}';
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
