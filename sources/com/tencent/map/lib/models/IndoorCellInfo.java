package com.tencent.map.lib.models;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.common.StringUtil;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public final class IndoorCellInfo {
    private List<String> areaIds = new ArrayList();
    private Style style;

    public IndoorCellInfo(@NonNull Style style) {
        this.style = style;
    }

    @NonNull
    public final List<String> getAreaIds() {
        return this.areaIds;
    }

    public final void addAreaId(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.areaIds.add(str);
    }

    public final Style getStyle() {
        return this.style;
    }

    public final void setStyle(Style style) {
        this.style = style;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndoorCellInfo{areaIds=");
        sb.append(this.areaIds);
        sb.append(", style=");
        sb.append(this.style != null ? this.style.toString() : StringUtil.NULL);
        sb.append('}');
        return sb.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class Style {
        private int color;

        public Style(int i) {
            this.color = i;
        }

        public int getColor() {
            return this.color;
        }

        public void setColor(int i) {
            this.color = i;
        }

        public String toString() {
            return "Style{color=" + Integer.toHexString(this.color) + '}';
        }
    }
}
