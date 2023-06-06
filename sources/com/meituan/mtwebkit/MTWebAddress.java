package com.meituan.mtwebkit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTWebAddress {
    public static final int MATCH_GROUP_AUTHORITY = 2;
    public static final int MATCH_GROUP_HOST = 3;
    public static final int MATCH_GROUP_PATH = 5;
    public static final int MATCH_GROUP_PORT = 4;
    public static final int MATCH_GROUP_SCHEME = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Pattern sAddressPattern = Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef%_-][a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);
    private String mAuthInfo;
    private String mHost;
    private String mPath;
    private int mPort;
    private String mScheme;

    public MTWebAddress(String str) throws ParseException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75f7ef51ea7e548f5e7f8973695b3a22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75f7ef51ea7e548f5e7f8973695b3a22");
        } else if (str == null) {
            throw new NullPointerException();
        } else {
            this.mScheme = "";
            this.mHost = "";
            this.mPort = -1;
            this.mPath = "/";
            this.mAuthInfo = "";
            Matcher matcher = sAddressPattern.matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                if (group != null) {
                    this.mScheme = group.toLowerCase(Locale.ROOT);
                }
                String group2 = matcher.group(2);
                if (group2 != null) {
                    this.mAuthInfo = group2;
                }
                String group3 = matcher.group(3);
                if (group3 != null) {
                    this.mHost = group3;
                }
                String group4 = matcher.group(4);
                if (group4 != null && group4.length() > 0) {
                    try {
                        this.mPort = Integer.parseInt(group4);
                    } catch (NumberFormatException unused) {
                        throw new RuntimeException("Bad port");
                    }
                }
                String group5 = matcher.group(5);
                if (group5 != null && group5.length() > 0) {
                    if (group5.charAt(0) == '/') {
                        this.mPath = group5;
                    } else {
                        this.mPath = "/" + group5;
                    }
                }
                if (this.mPort == 443 && this.mScheme.equals("")) {
                    this.mScheme = "https";
                } else if (this.mPort == -1) {
                    if (this.mScheme.equals("https")) {
                        this.mPort = 443;
                    } else {
                        this.mPort = 80;
                    }
                }
                if (this.mScheme.equals("")) {
                    this.mScheme = "http";
                    return;
                }
                return;
            }
            throw new RuntimeException("Bad address");
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10eee26c3798d88a2a1989ed8cca8be3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10eee26c3798d88a2a1989ed8cca8be3");
        }
        String str = "";
        if ((this.mPort != 443 && this.mScheme.equals("https")) || (this.mPort != 80 && this.mScheme.equals("http"))) {
            str = CommonConstant.Symbol.COLON + Integer.toString(this.mPort);
        }
        String str2 = "";
        if (this.mAuthInfo.length() > 0) {
            str2 = this.mAuthInfo + "@";
        }
        return this.mScheme + "://" + str2 + this.mHost + str + this.mPath;
    }

    public void setScheme(String str) {
        this.mScheme = str;
    }

    public String getScheme() {
        return this.mScheme;
    }

    public void setHost(String str) {
        this.mHost = str;
    }

    public String getHost() {
        return this.mHost;
    }

    public void setPort(int i) {
        this.mPort = i;
    }

    public int getPort() {
        return this.mPort;
    }

    public void setPath(String str) {
        this.mPath = str;
    }

    public String getPath() {
        return this.mPath;
    }

    public void setAuthInfo(String str) {
        this.mAuthInfo = str;
    }

    public String getAuthInfo() {
        return this.mAuthInfo;
    }
}
