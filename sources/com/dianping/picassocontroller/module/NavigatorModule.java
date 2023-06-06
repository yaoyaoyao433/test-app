package com.dianping.picassocontroller.module;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Keep;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.alipay.sdk.widget.d;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picassocontroller.annotation.PCSBMethod;
import com.dianping.picassocontroller.annotation.PCSBModule;
import com.dianping.picassocontroller.annotation.PCSModel;
import com.dianping.picassocontroller.jse.h;
import com.dianping.picassocontroller.vc.b;
import com.dianping.picassocontroller.vc.e;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
@PCSBModule(name = "navigator")
/* loaded from: classes.dex */
public class NavigatorModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class HiddenArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean hidden;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class IntentDataArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class NavBackgroundArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String color;
        public String shadowColor;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class NavItemArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String accessLabel;
        public boolean boldFont;
        public String iconBase64;
        public int iconHeight;
        public String iconName;
        public String iconUrl;
        public int iconWidth;
        public int spacing;
        public String title;
        public String titleColor;
        public boolean titleLeft;
        public int titleSize;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class NavItemsArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public NavItemArgument[] items;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class OverlayArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean overlay;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class PopArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean animated = true;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class SchemeArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String info;
        public String scheme;
        public boolean external = false;
        public boolean animated = true;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class StatusBarStyleArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int style;
    }

    @Keep
    @PCSBMethod(name = "openScheme")
    public Value openScheme(b bVar, SchemeArgument schemeArgument, com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, schemeArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54d2b2d507e21881b56087635ae574e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54d2b2d507e21881b56087635ae574e2");
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(schemeArgument.scheme));
            if (!TextUtils.isEmpty(schemeArgument.info)) {
                intent.putExtra("IntentData", schemeArgument.info);
            }
            if (!schemeArgument.external) {
                intent.setPackage(bVar.b().getPackageName());
            }
            bVar.b().startActivity(intent);
            bVar2.a(null);
            if (!schemeArgument.animated && (bVar.b() instanceof Activity)) {
                ((Activity) bVar.b()).overridePendingTransition(0, 0);
            }
            return new Value(true);
        } catch (Exception e) {
            e.printStackTrace();
            bVar2.b(null);
            return new Value(false);
        }
    }

    @Keep
    @PCSBMethod(name = "getIntentData")
    public void getIntentData(b bVar, IntentDataArgument intentDataArgument, com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, intentDataArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28c55050e6fbe26df7d951a355a6e1c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28c55050e6fbe26df7d951a355a6e1c9");
            return;
        }
        try {
            if (bVar instanceof e) {
                bVar2.a(((e) bVar).j);
            }
        } catch (Exception e) {
            e.printStackTrace();
            bVar2.b(null);
        }
    }

    @Keep
    @PCSBMethod(name = "pop")
    public void pop(b bVar, PopArgument popArgument) {
        Object[] objArr = {bVar, popArgument};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3b74a34badded700a6dca5b4b16ffb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3b74a34badded700a6dca5b4b16ffb9");
        } else if ((bVar instanceof g) && (bVar.b() instanceof Activity)) {
            ((Activity) bVar.b()).finish();
            if (popArgument == null || popArgument.animated) {
                return;
            }
            ((Activity) bVar.b()).overridePendingTransition(0, 0);
        }
    }

    @Keep
    @PCSBMethod(name = d.o)
    public void setTitle(final b bVar, final NavItemArgument navItemArgument, final com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, navItemArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4961a71778276610314d8859ce15f5e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4961a71778276610314d8859ce15f5e9");
        } else if (!(bVar instanceof g)) {
            bVar2.b(null);
        } else {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.NavigatorModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d787a5e3f1e388dae7615d8364d14719", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d787a5e3f1e388dae7615d8364d14719");
                        return;
                    }
                    com.dianping.picassocontroller.widget.b bVar3 = ((g) bVar).x;
                    if (bVar3 != null) {
                        bVar3.a(navItemArgument, new View.OnClickListener() { // from class: com.dianping.picassocontroller.module.NavigatorModule.1.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr3 = {view};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2f8624c3a63e6793e3cf8bb3b7955d42", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2f8624c3a63e6793e3cf8bb3b7955d42");
                                } else {
                                    bVar2.c(null);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    @Keep
    @PCSBMethod(name = "setRightItems")
    public void setRightItems(final b bVar, final NavItemsArgument navItemsArgument, final com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, navItemsArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "283b2aae8c8f399a303651ded0308574", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "283b2aae8c8f399a303651ded0308574");
        } else if (!(bVar instanceof g)) {
            bVar2.b(null);
        } else {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.NavigatorModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "237e840919d01a8bc12939ee099a0706", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "237e840919d01a8bc12939ee099a0706");
                        return;
                    }
                    com.dianping.picassocontroller.widget.b bVar3 = ((g) bVar).x;
                    if (bVar3 != null) {
                        bVar3.a(navItemsArgument.items, new View.OnClickListener() { // from class: com.dianping.picassocontroller.module.NavigatorModule.2.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr3 = {view};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "723edd7f58a43ff9562a0eb771e48ade", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "723edd7f58a43ff9562a0eb771e48ade");
                                    return;
                                }
                                Object tag = view.getTag(R.id.id_picasso_index);
                                if (tag == null || !(tag instanceof Integer)) {
                                    return;
                                }
                                bVar2.c(new JSONBuilder().put("index", Integer.valueOf(((Integer) tag).intValue())).toJSONObject());
                            }
                        });
                    }
                }
            });
        }
    }

    @Keep
    @PCSBMethod(name = "setLeftItems")
    public void setLeftItems(final b bVar, final NavItemsArgument navItemsArgument, final com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, navItemsArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f06c2e5d0a6b06b7840a2991e7ecc87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f06c2e5d0a6b06b7840a2991e7ecc87");
        } else if (!(bVar instanceof g)) {
            bVar2.b(null);
        } else {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.NavigatorModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "39222da4bacc1f5b13a8f7baf1ce19d7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "39222da4bacc1f5b13a8f7baf1ce19d7");
                        return;
                    }
                    com.dianping.picassocontroller.widget.b bVar3 = ((g) bVar).x;
                    if (bVar3 != null) {
                        bVar3.b(navItemsArgument.items, new View.OnClickListener() { // from class: com.dianping.picassocontroller.module.NavigatorModule.3.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr3 = {view};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cdfd92bcc277dd991588fe1e52f1c77f", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cdfd92bcc277dd991588fe1e52f1c77f");
                                    return;
                                }
                                Object tag = view.getTag(R.id.id_picasso_index);
                                if (tag == null || !(tag instanceof Integer)) {
                                    return;
                                }
                                bVar2.c(new JSONBuilder().put("index", Integer.valueOf(((Integer) tag).intValue())).toJSONObject());
                            }
                        });
                    }
                }
            });
        }
    }

    @Keep
    @PCSBMethod(name = "setBarHidden")
    public void setBarHidden(final b bVar, final HiddenArgument hiddenArgument, final com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, hiddenArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e05ef93a0c0bf36c9b35787dfa1d0f68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e05ef93a0c0bf36c9b35787dfa1d0f68");
        } else if (!(bVar instanceof g)) {
            bVar2.b(null);
        } else {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.NavigatorModule.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d0b09cb706435ea3349b76e42c1658c4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d0b09cb706435ea3349b76e42c1658c4");
                        return;
                    }
                    if (bVar.b() instanceof Activity) {
                        NavigatorModule.this.setFullScreen((Activity) bVar.b(), hiddenArgument.hidden);
                    }
                    com.dianping.picassocontroller.widget.b bVar3 = ((g) bVar).x;
                    if (bVar3 == null || hiddenArgument.hidden == bVar3.a()) {
                        return;
                    }
                    bVar3.setHidden(hiddenArgument.hidden);
                    if ((bVar instanceof g) && ((g) bVar).s != null) {
                        ViewGroup.LayoutParams layoutParams = ((g) bVar).s.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = hiddenArgument.hidden ? 0 : ((View) bVar3).getMeasuredHeight();
                        }
                        ((g) bVar).s.requestLayout();
                    }
                    bVar2.a(null);
                }
            });
        }
    }

    @Keep
    @PCSBMethod(name = "setBarOverlay")
    public void setBarOverlay(final b bVar, final OverlayArgument overlayArgument, final com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, overlayArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7e9616ad632b6c2b152ce0dbfe466e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7e9616ad632b6c2b152ce0dbfe466e4");
        } else if (!(bVar instanceof g)) {
            bVar2.b(null);
        } else {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.NavigatorModule.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7b5a3e6adfd4aaa89da1b00a6fafad69", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7b5a3e6adfd4aaa89da1b00a6fafad69");
                        return;
                    }
                    com.dianping.picassocontroller.widget.b bVar3 = ((g) bVar).x;
                    if (bVar3 != null) {
                        ViewGroup.LayoutParams layoutParams = ((g) bVar).s.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = overlayArgument.overlay ? 0 : ((View) bVar3).getMeasuredHeight();
                        }
                    }
                    bVar2.a(null);
                }
            });
        }
    }

    @Keep
    @PCSBMethod(name = "setBarBackgroundColor")
    public void setBarBackgroundColor(final b bVar, final NavBackgroundArgument navBackgroundArgument, final com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, navBackgroundArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76bbc0c82395732e45f4b96924226446", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76bbc0c82395732e45f4b96924226446");
        } else if (!(bVar instanceof g)) {
            bVar2.b(null);
        } else {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.NavigatorModule.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6d4c7919e02dd396a89c2ea182aa44e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6d4c7919e02dd396a89c2ea182aa44e4");
                        return;
                    }
                    com.dianping.picassocontroller.widget.b bVar3 = ((g) bVar).x;
                    if (bVar3 != null) {
                        try {
                            int parseColor = Color.parseColor(navBackgroundArgument.color);
                            bVar3.setBackgroundColor(parseColor);
                            NavigatorModule.this.setStatusBarColor((Activity) bVar.b(), parseColor);
                            if (!TextUtils.isEmpty(navBackgroundArgument.shadowColor)) {
                                bVar3.setShadowColor(Color.parseColor(navBackgroundArgument.shadowColor));
                            }
                            bVar2.a(null);
                        } catch (Exception e) {
                            e.printStackTrace();
                            bVar2.b(null);
                        }
                    }
                }
            });
        }
    }

    @Keep
    @PCSBMethod(name = "getBottomNavigationBarHeight")
    public void getBottomNavigationBarHeight(final b bVar, IntentDataArgument intentDataArgument, final com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, intentDataArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a27f3f07468711ea187344824caa3156", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a27f3f07468711ea187344824caa3156");
            return;
        }
        final JSONObject jSONObject = new JSONObject();
        if (!(bVar instanceof g) || !(bVar.b() instanceof Activity)) {
            try {
                jSONObject.put("height", 0);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            bVar2.a(jSONObject);
            return;
        }
        h.b((e) bVar, new Runnable() { // from class: com.dianping.picassocontroller.module.NavigatorModule.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "36a8eb75bcb0c9523d7c526bcb200643", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "36a8eb75bcb0c9523d7c526bcb200643");
                    return;
                }
                try {
                    jSONObject.put("height", PicassoUtils.px2dp(bVar.b(), PicassoUtils.getNavigationBarHeight((Activity) bVar.b())));
                    bVar2.a(jSONObject);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusBarColor(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e56128d5828b200c23febff9a6b89c42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e56128d5828b200c23febff9a6b89c42");
        } else if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().setStatusBarColor(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullScreen(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f5a8f71798b8363d3066f0a728470d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f5a8f71798b8363d3066f0a728470d0");
        } else if (Build.VERSION.SDK_INT >= 23) {
            Window window = activity.getWindow();
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility | 1024 | 256 : (systemUiVisibility ^ 1024) ^ 256);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(z ? 0 : -1);
        }
    }
}
