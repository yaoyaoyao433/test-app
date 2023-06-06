package com.sankuai.titans.base;

import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class TitansCookie {
    public static final String DEFAULT_COMMENT = null;
    public static final String DEFAULT_COMMENTURL = null;
    public static final boolean DEFAULT_HTTPONLY = false;
    public static final int DEFAULT_MAX_AGE = 315360000;
    public static final String DEFAULT_PATH = null;
    public static final String DEFAULT_PORTLIST = null;
    public static final boolean DEFAULT_SECURE = false;
    public static final boolean DEFAULT_TODISCARD = false;
    public static final int DEFAULT_VERSION = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("commentURL")
    @Expose
    private String commentURL;
    @SerializedName("domainList")
    @Expose
    private Set<String> domainSet;
    @SerializedName("httpOnly")
    @Expose
    private boolean httpOnly;
    @SerializedName("maxAge")
    @Expose
    private int maxAge;
    @SerializedName("name")
    @Expose
    private final String name;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("portlist")
    @Expose
    private String portlist;
    @SerializedName("secure")
    @Expose
    private boolean secure;
    @SerializedName("source")
    @Expose
    private final String source;
    @SerializedName("toDiscard")
    @Expose
    private boolean toDiscard;
    @SerializedName("value")
    @Expose
    private final String value;
    @SerializedName("version")
    @Expose
    private int version;

    public TitansCookie(@NonNull String str, String str2, @NonNull String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77515ae3bbaa4016801e2e698239c145", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77515ae3bbaa4016801e2e698239c145");
            return;
        }
        this.maxAge = 315360000;
        this.comment = DEFAULT_COMMENT;
        this.commentURL = DEFAULT_COMMENTURL;
        this.toDiscard = false;
        this.path = DEFAULT_PATH;
        this.portlist = DEFAULT_PORTLIST;
        this.secure = false;
        this.httpOnly = false;
        this.version = 1;
        this.name = str;
        this.value = str2;
        this.source = str3;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getSource() {
        return this.source;
    }

    public final long getMaxAge() {
        return this.maxAge;
    }

    public final void setMaxAge(int i) {
        this.maxAge = i;
    }

    public final Set<String> getDomainSet() {
        return this.domainSet;
    }

    public final void setDomainSet(Set<String> set) {
        this.domainSet = set;
    }

    public final String getComment() {
        return this.comment;
    }

    public final void setComment(String str) {
        this.comment = str;
    }

    public final String getCommentURL() {
        return this.commentURL;
    }

    public final void setCommentURL(String str) {
        this.commentURL = str;
    }

    public final boolean isToDiscard() {
        return this.toDiscard;
    }

    public final void setToDiscard(boolean z) {
        this.toDiscard = z;
    }

    public final String getPath() {
        return this.path;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final String getPortlist() {
        return this.portlist;
    }

    public final void setPortlist(String str) {
        this.portlist = str;
    }

    public final boolean getSecure() {
        return this.secure;
    }

    public final void setSecure(boolean z) {
        this.secure = z;
    }

    public final boolean isHttpOnly() {
        return this.httpOnly;
    }

    public final void setHttpOnly(boolean z) {
        this.httpOnly = z;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final String getFormatCookieString(String str) {
        String value;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c250bb9a1f0b3d6ff38cee436fa21f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c250bb9a1f0b3d6ff38cee436fa21f8");
        }
        try {
            value = URLEncoder.encode(getValue(), "utf-8");
        } catch (Throwable th) {
            Titans.serviceManager().getStatisticsService().reportClassError("TitansCookie", "getFormatCookieString", th);
            value = getValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append("=");
        sb.append(value);
        sb.append("; Domain=");
        sb.append(str);
        if (!TextUtils.isEmpty(getPath())) {
            sb.append("; Path=");
            sb.append(getPath());
        }
        if (getMaxAge() > 0) {
            sb.append("; Expires=");
            sb.append(new Date(System.currentTimeMillis() + (getMaxAge() * 1000)).toString());
        }
        if (getSecure()) {
            sb.append("; Secure");
        }
        if (TextUtils.equals("token", getName()) || TextUtils.equals("dper", getName())) {
            sb.append("; HttpOnly");
        } else if (Build.VERSION.SDK_INT >= 24 && isHttpOnly()) {
            sb.append("; HttpOnly");
        }
        return sb.toString();
    }
}
