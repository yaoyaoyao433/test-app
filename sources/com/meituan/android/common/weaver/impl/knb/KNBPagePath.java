package com.meituan.android.common.weaver.impl.knb;

import android.app.Activity;
import android.net.Uri;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.meituan.android.common.weaver.impl.natives.NativeFFPEvent;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.android.common.weaver.impl.utils.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class KNBPagePath extends PagePathHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Class<?> sKNBClazz = WebView.class;
    @GuardedBy("this")
    private Map<String, Object> options;
    private String url;

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public void fillPagePathInfo(@NonNull NativeFFPEvent nativeFFPEvent) {
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public boolean fullPage() {
        return false;
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public boolean hasSpecialPagePath() {
        return false;
    }

    public KNBPagePath(@NonNull Activity activity, String str) {
        super(activity);
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dff9579e5d382a33d9090e79c70bae09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dff9579e5d382a33d9090e79c70bae09");
        } else {
            this.url = str;
        }
    }

    public synchronized void setOptions(@Nullable Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15d9b4f1ab358517bcf88c970ef49032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15d9b4f1ab358517bcf88c970ef49032");
        } else if (map == null) {
        } else {
            if (this.options == null) {
                this.options = map;
            } else {
                this.options.putAll(map);
            }
        }
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    @Nullable
    public String getPagePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "537f0cb9f900bc87ae7ec677611f8a58", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "537f0cb9f900bc87ae7ec677611f8a58");
        }
        if (this.options != null && (this.options.get("pagePath") instanceof String)) {
            String str = (String) this.options.get("pagePath");
            this.pagePath = str;
            return str;
        }
        if (!TextUtils.isEmpty(this.url)) {
            String path = Uri.parse(this.url).getPath();
            if (!TextUtils.isEmpty(path)) {
                this.pagePath = path;
            }
        }
        return this.pagePath;
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public void fillBlankPagePathInfo(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b07b30cf8559d76f257e66011cf6ccec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b07b30cf8559d76f257e66011cf6ccec");
            return;
        }
        synchronized (this) {
            Map<String, Object> map2 = this.options;
            if (map2 != null) {
                map.putAll(map2);
            }
        }
        super.fillBlankPagePathInfo(map);
        map.put("tType", "knb");
        map.put("source", "KNB");
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    @Nullable
    public View getRootView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a9683626d23634105d0fe5b4acbda3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a9683626d23634105d0fe5b4acbda3a");
        }
        View findViewById = this.activity.findViewById(16908290);
        View findWebView = findWebView(findViewById);
        return findWebView == null ? findViewById : findWebView;
    }

    @Nullable
    private View findWebView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b47ac30f12965fdbe23628ab4f72e27", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b47ac30f12965fdbe23628ab4f72e27");
        }
        if (view == null || sKNBClazz == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        if (view instanceof ViewGroup) {
            linkedList.add((ViewGroup) view);
        }
        LinkedList linkedList2 = new LinkedList();
        while (true) {
            ViewGroup viewGroup = (ViewGroup) linkedList.poll();
            if (viewGroup == null) {
                break;
            }
            if (viewGroup instanceof WebView) {
                linkedList2.add(viewGroup);
            }
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (sKNBClazz.isInstance(childAt)) {
                    linkedList2.add(childAt);
                } else if (childAt instanceof ViewGroup) {
                    linkedList.add((ViewGroup) childAt);
                }
            }
        }
        if (linkedList2.isEmpty()) {
            return null;
        }
        if (linkedList2.size() > 1) {
            Logger.getLogger().d("WebView more than one: ", linkedList2);
        }
        return (View) linkedList2.get(0);
    }
}
