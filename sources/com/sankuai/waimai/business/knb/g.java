package com.sankuai.waimai.business.knb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.support.constraint.R;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.dianping.titans.ui.ITitleContentV2;
import com.dianping.titans.widget.BaseTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends BaseTitleBar {
    public static ChangeQuickRedirect a;
    private Context b;
    private a c;
    private boolean d;
    private ITitleContentV2.IImageTitleInterceptor e;
    private boolean f;
    private View.OnClickListener g;

    public g(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa4123aca307aaa2d1be24b07c85c9c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa4123aca307aaa2d1be24b07c85c9c0");
            return;
        }
        this.d = true;
        this.b = context;
    }

    public final a getTitle() {
        return this.c;
    }

    @Override // com.dianping.titans.widget.BaseTitleBar
    public final void initViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205457b94a78294705685f66d1034c14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205457b94a78294705685f66d1034c14");
            return;
        }
        super.initViews();
        findViewById(R.id.web_title_bar).setBackgroundColor(0);
    }

    @Override // com.dianping.titans.widget.BaseTitleBar, android.view.View, com.dianping.titans.ui.ITitleBar
    public final void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d89c4ac584996869b50fe36d684d40e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d89c4ac584996869b50fe36d684d40e");
            return;
        }
        super.setBackgroundColor(i);
        findViewById(R.id.web_title_bar).setBackgroundColor(i);
    }

    @Override // com.dianping.titans.widget.BaseTitleBar
    public final BaseTitleBar.ITitleContent createTitleContentView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4010287fe19bf58503f86ae138ddecd8", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseTitleBar.ITitleContent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4010287fe19bf58503f86ae138ddecd8");
        }
        this.c = new a(getContext());
        return this.c;
    }

    public final void setTitleImg(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d46f1154f490467a6bdbfb9e9a6b93b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d46f1154f490467a6bdbfb9e9a6b93b");
        } else {
            this.c.setTitleImg(str);
        }
    }

    public final void setCustomTitleText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cac72fd1d783ab6218f9bf4da54795b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cac72fd1d783ab6218f9bf4da54795b0");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.c.setCustomTitleText(str);
        }
    }

    public final void setIsAutoSetTitle(boolean z) {
        this.d = z;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends FrameLayout implements View.OnClickListener, ITitleContentV2 {
        public static ChangeQuickRedirect a;
        private final ImageView c;
        private final TextView d;
        private View e;

        @Override // com.dianping.titans.widget.BaseTitleBar.ITitleContent
        public final void setTitleContentParams(JSONObject jSONObject) {
        }

        public a(Context context) {
            super(context);
            Object[] objArr = {g.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a05c6f9070bb4f40b64c9c55c0eb542e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a05c6f9070bb4f40b64c9c55c0eb542e");
                return;
            }
            setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.e = LayoutInflater.from(context).inflate(R.layout.wm_knb_layout_titlebar, this);
            this.c = (ImageView) this.e.findViewById(R.id.knb_title_img);
            this.d = (TextView) this.e.findViewById(R.id.knb_title_text);
            this.d.setSingleLine(true);
            this.d.setEllipsize(TextUtils.TruncateAt.END);
            this.d.setGravity(17);
        }

        @Override // com.dianping.titans.widget.BaseTitleBar.ITitleContent
        public final void setTitleText(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf65a2805868c4606b8134a55b7e2695", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf65a2805868c4606b8134a55b7e2695");
                return;
            }
            if (g.this.d) {
                this.d.setText(str);
            }
            this.d.setVisibility(0);
            this.c.setVisibility(8);
        }

        public final void setCustomTitleText(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79bf1abca25c080d841d610c15013439", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79bf1abca25c080d841d610c15013439");
                return;
            }
            this.d.setText(str);
            this.d.setVisibility(0);
            this.c.setVisibility(8);
        }

        @Override // com.dianping.titans.widget.BaseTitleBar.ITitleContent
        public final String getTitleText() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3a96a4199ae0b694ed262b5f0e248e2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3a96a4199ae0b694ed262b5f0e248e2") : this.d.getText().toString();
        }

        @Override // com.dianping.titans.widget.BaseTitleBar.ITitleContent
        public final int getCalculatedWidth() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "537c96e4ae2afc371d215140a394f61e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "537c96e4ae2afc371d215140a394f61e")).intValue() : (int) Layout.getDesiredWidth(getTitleText(), this.d.getPaint());
        }

        public final void setTitleImg(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47be481362097601c10f72af3fee1630", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47be481362097601c10f72af3fee1630");
                return;
            }
            this.c.setVisibility(0);
            this.d.setVisibility(8);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = g.this.b;
            a2.c = str;
            a2.a(this.c);
        }

        @Override // com.dianping.titans.ui.ITitleContentV2
        public final void setTitleImageLayout(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aca22a070fac11621ee7a55cdd4df4bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aca22a070fac11621ee7a55cdd4df4bc");
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (i > 0) {
                layoutParams.width = i;
            }
            if (i2 > 0) {
                layoutParams.height = i2;
            }
            this.c.requestLayout();
        }

        @Override // com.dianping.titans.ui.ITitleContentV2
        public final boolean setTitleImage(Bitmap bitmap) {
            Object[] objArr = {bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad7ee3105cbe84a877eeb2043b94850b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad7ee3105cbe84a877eeb2043b94850b")).booleanValue();
            }
            if (bitmap == null) {
                return false;
            }
            this.d.setVisibility(8);
            this.c.setVisibility(0);
            this.c.setImageBitmap(bitmap);
            return true;
        }

        @Override // com.dianping.titans.ui.ITitleContentV2
        public final void setOnTitleClickListener(View.OnClickListener onClickListener) {
            Object[] objArr = {onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9169f9eada5df723ea7cd110822eba72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9169f9eada5df723ea7cd110822eba72");
            } else {
                g.this.g = onClickListener;
            }
        }

        @Override // com.dianping.titans.ui.ITitleContentV2
        public final void runOnUiThread(final Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8824aee8fe0200a508b6f4799c471ac7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8824aee8fe0200a508b6f4799c471ac7");
            } else if (runnable == null) {
            } else {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    try {
                        runnable.run();
                        return;
                    } catch (Exception e) {
                        com.sankuai.waimai.imbase.log.a.a("WMTakeoutKNBTitleBar", e.getMessage(), new Object[0]);
                        return;
                    }
                }
                post(new Runnable() { // from class: com.sankuai.waimai.business.knb.g.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e363b59816c2890dc82e70f3be7427e1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e363b59816c2890dc82e70f3be7427e1");
                            return;
                        }
                        try {
                            runnable.run();
                        } catch (Exception e2) {
                            com.sankuai.waimai.imbase.log.a.a("WMTakeoutKNBTitleBar", e2.getMessage(), new Object[0]);
                        }
                    }
                });
            }
        }

        @Override // com.dianping.titans.ui.ITitleContentV2
        public final void setImageTitleInterceptor(ITitleContentV2.IImageTitleInterceptor iImageTitleInterceptor) {
            Object[] objArr = {iImageTitleInterceptor};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad7d67d8be480f447b53fbc3b52883cf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad7d67d8be480f447b53fbc3b52883cf");
            } else {
                g.this.e = iImageTitleInterceptor;
            }
        }

        @Override // com.dianping.titans.ui.ITitleContentV2
        public final ITitleContentV2.IImageTitleInterceptor getImageTitleInterceptor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4500424c059dc5a2a833faf705f05b2d", RobustBitConfig.DEFAULT_VALUE) ? (ITitleContentV2.IImageTitleInterceptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4500424c059dc5a2a833faf705f05b2d") : g.this.e;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5594ec5e7722d44d742e09f31b1a0435", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5594ec5e7722d44d742e09f31b1a0435");
                return;
            }
            super.onAttachedToWindow();
            g.this.f = false;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c856508b73bd0dc4ecfa85f77f2d41b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c856508b73bd0dc4ecfa85f77f2d41b");
                return;
            }
            super.onDetachedFromWindow();
            g.this.f = true;
        }

        @Override // com.dianping.titans.ui.ITitleContentV2
        public final boolean isDetachedFromWindow() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5091378d646d1aec22a47a55f7a223e2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5091378d646d1aec22a47a55f7a223e2")).booleanValue() : g.this.f;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a45abfa75fc2d0c1bef189a2eed7366", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a45abfa75fc2d0c1bef189a2eed7366");
                return;
            }
            if (g.this.onTitleBarEventListener != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", "action");
                } catch (JSONException e) {
                    com.sankuai.waimai.imbase.log.a.a("WMTakeoutKNBTitleBar", e.getMessage(), new Object[0]);
                }
                g.this.onTitleBarEventListener.onEvent(jSONObject);
            }
            if (g.this.g != null) {
                g.this.g.onClick(view);
            }
        }
    }
}
