package com.meituan.android.recce.views.image;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewParent;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.recce.RecceRootView;
import com.meituan.android.recce.views.anim.RecceAnim;
import com.meituan.android.recce.views.anim.RecceAnimator;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceImageView extends RecceRCTRoundImageView implements RecceAnim {
    public static ChangeQuickRedirect changeQuickRedirect;
    private RecceAnimator recceAnimator;
    private ReadableArray sources;

    public RecceImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "281696fefc750b28040876d2450fd8f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "281696fefc750b28040876d2450fd8f2");
        }
    }

    @Override // com.meituan.android.recce.views.image.RecceRCTRoundImageView
    public void setSource(ReadableArray readableArray) {
        double d;
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ed2df87a54d807bd05a46826563e0f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ed2df87a54d807bd05a46826563e0f2");
        } else if (readableArray != null && readableArray.size() > 0) {
            ReadableMap map = readableArray.getMap(0);
            double d2 = 0.0d;
            if (map != null) {
                r1 = map.hasKey(Constants.TRAFFIC_URI) ? map.getString(Constants.TRAFFIC_URI) : null;
                d = map.hasKey("width") ? map.getDouble("width") : 0.0d;
                if (map.hasKey("height")) {
                    d2 = map.getDouble("height");
                }
            } else {
                d = 0.0d;
            }
            if (!TextUtils.isEmpty(r1) && !r1.startsWith("http") && !r1.startsWith("data:image")) {
                String imageCacheDir = getImageCacheDir();
                if (!TextUtils.isEmpty(imageCacheDir)) {
                    r1 = "file://" + imageCacheDir + "/" + r1;
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(JavaOnlyMap.of(Constants.TRAFFIC_URI, r1, "width", Double.valueOf(d), "height", Double.valueOf(d2)));
            this.sources = JavaOnlyArray.from(arrayList);
            super.setSource(this.sources);
        } else {
            super.setSource(readableArray);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        double d;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f713a3e30831092baf24cb6651d70f7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f713a3e30831092baf24cb6651d70f7e");
            return;
        }
        super.onAttachedToWindow();
        if (this.sources == null || this.sources.size() <= 0) {
            return;
        }
        ReadableMap map = this.sources.getMap(0);
        double d2 = 0.0d;
        if (map != null) {
            r2 = map.hasKey(Constants.TRAFFIC_URI) ? map.getString(Constants.TRAFFIC_URI) : null;
            d = map.hasKey("width") ? map.getDouble("width") : 0.0d;
            if (map.hasKey("height")) {
                d2 = map.getDouble("height");
            }
        } else {
            d = 0.0d;
        }
        if (TextUtils.isEmpty(r2) || r2.startsWith("http") || r2.startsWith("data:image") || r2.startsWith("file://")) {
            return;
        }
        String imageCacheDir = getImageCacheDir();
        if (!TextUtils.isEmpty(imageCacheDir)) {
            r2 = "file://" + imageCacheDir + "/" + r2;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(JavaOnlyMap.of(Constants.TRAFFIC_URI, r2, "width", Double.valueOf(d), "height", Double.valueOf(d2)));
        this.sources = JavaOnlyArray.from(arrayList);
        super.setSource(this.sources);
        maybeUpdateView();
    }

    private String getImageCacheDir() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee3e4c73f23d25abee60a4ab84e07844", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee3e4c73f23d25abee60a4ab84e07844");
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RecceRootView) {
                return ((RecceRootView) parent).getRecceInstanceManager().h + "/dist/image";
            }
        }
        return "";
    }

    @Override // com.meituan.android.recce.views.anim.RecceAnim
    public void start(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10cf8cbcaac4b648f51f72d150d11ee5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10cf8cbcaac4b648f51f72d150d11ee5");
        } else if (z) {
            getRecceAnimator().start();
        } else {
            getRecceAnimator().cancel();
        }
    }

    @Override // com.meituan.android.recce.views.anim.RecceAnim
    public void bindAnimData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8586285447071d81c0cbef11ae006778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8586285447071d81c0cbef11ae006778");
        } else {
            getRecceAnimator().config(str);
        }
    }

    private RecceAnimator getRecceAnimator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6fce7d2d86add843917e02071692e88", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecceAnimator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6fce7d2d86add843917e02071692e88");
        }
        if (this.recceAnimator == null) {
            this.recceAnimator = new RecceAnimator(this);
        }
        return this.recceAnimator;
    }
}
