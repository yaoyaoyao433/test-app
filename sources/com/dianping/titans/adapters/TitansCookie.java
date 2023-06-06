package com.dianping.titans.adapters;

import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.titans.utils.CookieUtil;
import com.dianping.titans.utils.ReflectUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.HttpCookie;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TitansCookie {
    public static final String DEFAULT_COMMENT = null;
    public static final String DEFAULT_COMMENTURL = null;
    public static final List<String> DEFAULT_DOMAINLIST = CookieUtil.ALL_HOST;
    public static final boolean DEFAULT_HTTPONLY = false;
    public static final int DEFAULT_MAX_AGE = 315360000;
    public static final String DEFAULT_PATH = null;
    public static final String DEFAULT_PORTLIST = null;
    public static final boolean DEFAULT_SECURE = false;
    public static final boolean DEFAULT_TODISCARD = false;
    public static final int DEFAULT_VERSION = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String comment;
    private String commentURL;
    private List<String> domainList;
    private boolean httpOnly;
    private int maxAge;
    private String name;
    private String path;
    private String portlist;
    private boolean secure;
    private String source;
    private boolean toDiscard;
    private String value;
    private int version;

    public TitansCookie(@NonNull String str, String str2, @NonNull String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eb2102a33e04cc82d5c57813ee42465", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eb2102a33e04cc82d5c57813ee42465");
            return;
        }
        this.maxAge = 315360000;
        this.domainList = DEFAULT_DOMAINLIST;
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

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public String getSource() {
        return this.source;
    }

    public long getMaxAge() {
        return this.maxAge;
    }

    public void setMaxAge(int i) {
        this.maxAge = i;
    }

    public List<String> getDomainList() {
        return this.domainList;
    }

    public void setDomainList(List<String> list) {
        this.domainList = list;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public String getCommentURL() {
        return this.commentURL;
    }

    public void setCommentURL(String str) {
        this.commentURL = str;
    }

    public boolean isToDiscard() {
        return this.toDiscard;
    }

    public void setToDiscard(boolean z) {
        this.toDiscard = z;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String getPortlist() {
        return this.portlist;
    }

    public void setPortlist(String str) {
        this.portlist = str;
    }

    public boolean getSecure() {
        return this.secure;
    }

    public void setSecure(boolean z) {
        this.secure = z;
    }

    public boolean isHttpOnly() {
        return this.httpOnly;
    }

    public void setHttpOnly(boolean z) {
        this.httpOnly = z;
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String getFormatCookieString(String str) {
        String value;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7069eb83e46f2bd5ce921825bee1c524", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7069eb83e46f2bd5ce921825bee1c524");
        }
        try {
            value = URLEncoder.encode(getValue(), "utf-8");
        } catch (Throwable unused) {
            value = getValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + "=" + value);
        StringBuilder sb2 = new StringBuilder("; Domain=");
        sb2.append(str);
        sb.append(sb2.toString());
        if (!TextUtils.isEmpty(getPath())) {
            sb.append("; Path=" + getPath());
        }
        if (getMaxAge() > 0) {
            sb.append("; Expires=" + new Date(System.currentTimeMillis() + (getMaxAge() * 1000)).toString());
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

    public static TitansCookie getCookieFromHttpCookie(String str, HttpCookie httpCookie) {
        Object[] objArr = {str, httpCookie};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7bd79b670548354904f9934a9bc58018", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitansCookie) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7bd79b670548354904f9934a9bc58018");
        }
        if (httpCookie == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String name = httpCookie.getName();
        String value = httpCookie.getValue();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        TitansCookie titansCookie = new TitansCookie(name, value, str);
        ArrayList arrayList = new ArrayList();
        String domain = httpCookie.getDomain();
        if (TextUtils.isEmpty(domain)) {
            arrayList.addAll(DEFAULT_DOMAINLIST);
        } else {
            arrayList.add(domain);
        }
        titansCookie.setDomainList(arrayList);
        titansCookie.setMaxAge((int) httpCookie.getMaxAge());
        titansCookie.setComment(httpCookie.getComment());
        titansCookie.setCommentURL(httpCookie.getCommentURL());
        titansCookie.setPath(httpCookie.getPath());
        titansCookie.setPortlist(httpCookie.getPortlist());
        if (Build.VERSION.SDK_INT >= 24) {
            titansCookie.setHttpOnly(httpCookie.isHttpOnly());
        }
        titansCookie.setSecure(httpCookie.getSecure());
        titansCookie.setToDiscard(httpCookie.getDiscard());
        titansCookie.setVersion(httpCookie.getVersion());
        return titansCookie;
    }

    public static TitansCookie getCookieFromMap(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "184fc4ffe3adbe36407c4ca737c551a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitansCookie) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "184fc4ffe3adbe36407c4ca737c551a9");
        }
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = (String) ReflectUtils.getValueFromMap(map, "name", String.class, "");
        String str3 = (String) ReflectUtils.getValueFromMap(map, "value", String.class, "");
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        TitansCookie titansCookie = new TitansCookie(str2, str3, str);
        try {
            titansCookie.setDomainList((List) ReflectUtils.getValueFromMap(map, "domainList", List.class, DEFAULT_DOMAINLIST));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        titansCookie.setMaxAge(((Integer) ReflectUtils.getValueFromMap(map, "maxAge", Integer.TYPE, 315360000)).intValue());
        titansCookie.setComment((String) ReflectUtils.getValueFromMap(map, "comment", String.class, DEFAULT_COMMENT));
        titansCookie.setCommentURL((String) ReflectUtils.getValueFromMap(map, "commentURL", String.class, DEFAULT_COMMENTURL));
        titansCookie.setPath((String) ReflectUtils.getValueFromMap(map, "path", String.class, DEFAULT_PATH));
        titansCookie.setPortlist((String) ReflectUtils.getValueFromMap(map, "portlist", String.class, DEFAULT_PORTLIST));
        if (Build.VERSION.SDK_INT >= 24) {
            titansCookie.setHttpOnly(((Boolean) ReflectUtils.getValueFromMap(map, "httpOnly", Boolean.TYPE, Boolean.FALSE)).booleanValue());
        }
        titansCookie.setSecure(((Boolean) ReflectUtils.getValueFromMap(map, "secure", Boolean.TYPE, Boolean.FALSE)).booleanValue());
        titansCookie.setToDiscard(((Boolean) ReflectUtils.getValueFromMap(map, "toDiscard", Boolean.TYPE, Boolean.FALSE)).booleanValue());
        titansCookie.setVersion(((Integer) ReflectUtils.getValueFromMap(map, "version", Integer.TYPE, 1)).intValue());
        return titansCookie;
    }
}
