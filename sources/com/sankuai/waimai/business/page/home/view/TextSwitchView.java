package com.sankuai.waimai.business.page.home.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TextSwitchView extends TextSwitcher implements ViewSwitcher.ViewFactory {
    public static ChangeQuickRedirect a;
    public int b;
    public List<String> c;
    public Handler d;
    public boolean e;
    public int f;
    private long g;
    private b h;
    private Animation i;
    private Animation j;
    private boolean k;
    private boolean l;
    private boolean m;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(String str, int i, int i2);
    }

    public TextSwitchView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0006a7b69820952459a5c090918771b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0006a7b69820952459a5c090918771b8");
            return;
        }
        this.g = PayTask.j;
        this.b = 0;
        this.k = false;
        this.l = false;
        this.e = false;
        this.f = 0;
        this.m = false;
        e();
    }

    public TextSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "533d30f2239f92f175cefca45b98e6a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "533d30f2239f92f175cefca45b98e6a9");
            return;
        }
        this.g = PayTask.j;
        this.b = 0;
        this.k = false;
        this.l = false;
        this.e = false;
        this.f = 0;
        this.m = false;
        e();
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2065aa42d048e20131ea1d9b17907c57", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2065aa42d048e20131ea1d9b17907c57");
        }
        TextView textView = new TextView(getContext(), null, R.style.WmText);
        textView.setText(R.string.wm_page_hint_global_search);
        textView.setTextSize(14.0f);
        textView.setTextColor(this.m ? -11052967 : -8026489);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        textView.setGravity(16);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fca89c10dbc1a00cbd184b98f31e0bf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fca89c10dbc1a00cbd184b98f31e0bf7");
            return;
        }
        setFactory(this);
        f();
        g();
    }

    @SuppressLint({"HandlerLeak"})
    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "507ac6e8ce51ba353e7375d058e96a73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "507ac6e8ce51ba353e7375d058e96a73");
        } else {
            this.d = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.business.page.home.view.TextSwitchView.1
                public static ChangeQuickRedirect a;

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    Object[] objArr2 = {message};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c78e2210d7d485c065b852215d6466f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c78e2210d7d485c065b852215d6466f");
                        return;
                    }
                    TextSwitchView.this.h();
                    TextSwitchView.this.c();
                }
            };
        }
    }

    public void setTextEnhance(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb8eb3141f3a2791eeec1e78f2318a37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb8eb3141f3a2791eeec1e78f2318a37");
            return;
        }
        this.m = z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) instanceof TextView) {
                ((TextView) getChildAt(i)).setTextColor(z ? -11052967 : -8026489);
            }
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3176902534dc5fcc3fdc11ca3863162a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3176902534dc5fcc3fdc11ca3863162a");
            return;
        }
        this.i = AnimationUtils.loadAnimation(getContext(), R.anim.homepage_def_text_anim_in);
        this.i.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.business.page.home.view.TextSwitchView.2
            public static ChangeQuickRedirect a;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48f1ee5d1529897139292c3d6fd96406", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48f1ee5d1529897139292c3d6fd96406");
                } else {
                    TextSwitchView.this.k = true;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9092f0df09b46fdd16282473779df64", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9092f0df09b46fdd16282473779df64");
                } else {
                    TextSwitchView.this.k = false;
                }
            }
        });
        this.j = AnimationUtils.loadAnimation(getContext(), R.anim.homepage_def_text_anim_out);
        this.j.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.business.page.home.view.TextSwitchView.3
            public static ChangeQuickRedirect a;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e99c2685ee4ff918c866a756fd604895", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e99c2685ee4ff918c866a756fd604895");
                } else {
                    TextSwitchView.this.l = true;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f463c4571a2afcff7c97c434bdeecd36", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f463c4571a2afcff7c97c434bdeecd36");
                } else {
                    TextSwitchView.this.l = false;
                }
            }
        });
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4942b167392d2b477067300ab146f699", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4942b167392d2b477067300ab146f699");
            return;
        }
        setInAnimation(this.i);
        setOutAnimation(this.j);
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acfa2c2b37d53167a98b1a4121df032f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acfa2c2b37d53167a98b1a4121df032f");
            return;
        }
        setInAnimation(null);
        setOutAnimation(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd3c3949ffa94ab437bd9a2057ff92de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd3c3949ffa94ab437bd9a2057ff92de");
        } else if (this.c == null || this.c.size() == 0) {
        } else {
            int size = (this.f + 1) % this.c.size();
            this.b += (this.f + 1) / this.c.size();
            setText(this.c.get(size));
            this.f = size;
            if (this.h != null) {
                this.h.a(this.c.get(size), size, this.b);
            }
        }
    }

    public int getFirstRollWordWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0bafcb9a4ec56097699957d6f733e87", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0bafcb9a4ec56097699957d6f733e87")).intValue();
        }
        return (int) ((TextView) getCurrentView()).getPaint().measureText(!com.sankuai.waimai.modular.utils.a.a(this.c) ? this.c.get(0) : "");
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a79380d4ca4337122661d6301b49a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a79380d4ca4337122661d6301b49a11");
        } else if (this.c == null || this.c.size() <= 1) {
        } else {
            this.d.removeCallbacksAndMessages(null);
            this.d.sendEmptyMessageDelayed(1, this.g);
            this.e = true;
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a319c56b1e640321d5fc29c20447dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a319c56b1e640321d5fc29c20447dd");
            return;
        }
        this.d.removeCallbacksAndMessages(null);
        this.e = false;
    }

    public String getShowingText() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d5803e2b12d7770e3ae90898f5120d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d5803e2b12d7770e3ae90898f5120d8");
        }
        int i = this.f;
        if (this.c == null || this.c.size() <= i) {
            return null;
        }
        if (i < 0) {
            return ((TextView) getCurrentView()).getText().toString();
        }
        if ((this.k || this.l) ? true : true) {
            i = i == 0 ? this.c.size() - 1 : i - 1;
        }
        return this.c.get(i);
    }

    public int getShowingTextIndex() {
        return this.f;
    }

    public final void a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb57ad1913d8b3d271308ba0ae1e60f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb57ad1913d8b3d271308ba0ae1e60f0");
        } else if (list == null || list.size() == 0) {
        } else {
            d();
            this.c = list;
            this.f = -1;
            this.b = 0;
            b();
            h();
            if (this.c.size() > 1) {
                a();
            }
            c();
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fed93bf889422f700a023a614432d999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fed93bf889422f700a023a614432d999");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            a(arrayList);
        }
    }

    public void setTextFlipListener(b bVar) {
        this.h = bVar;
    }

    public void setInterval(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71ee88e943ec1377d52c31320b27de39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71ee88e943ec1377d52c31320b27de39");
        } else if (j <= 0) {
        } else {
            this.g = j;
        }
    }
}
