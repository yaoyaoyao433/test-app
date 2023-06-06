package com.sankuai.waimai.mach.debug;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.shield.entity.ExposeAction;
import com.facebook.yoga.YogaEdge;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.common.DevSettings;
import com.sankuai.waimai.mach.m;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.mach.utils.i;
import com.sankuai.waimai.mach.widget.d;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    public static boolean a() {
        return b;
    }

    public static void a(boolean z) {
        b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @SuppressLint({"ViewConstructor"})
    /* renamed from: com.sankuai.waimai.mach.debug.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1009a extends FrameLayout {
        public static ChangeQuickRedirect a;
        public TransitionDrawable b;
        private LinearLayout c;
        private final com.sankuai.waimai.mach.node.a<?> d;
        private final e e;
        private final Runnable f;

        public C1009a(@NonNull Context context, @NonNull View view, e eVar, com.sankuai.waimai.mach.node.a<?> aVar) {
            super(context);
            ViewGroup.LayoutParams layoutParams;
            String str;
            Object[] objArr = {context, view, eVar, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91b6e173ce532920a6d79060a007145e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91b6e173ce532920a6d79060a007145e");
                return;
            }
            this.b = new TransitionDrawable(new Drawable[]{new ColorDrawable(-1996554240), new ColorDrawable(0)});
            this.f = new Runnable() { // from class: com.sankuai.waimai.mach.debug.a.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48831f0366e81653f6ef3576ffffc804", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48831f0366e81653f6ef3576ffffc804");
                    } else {
                        C1009a.this.a();
                    }
                }
            };
            setClipChildren(true);
            this.d = aVar;
            this.e = eVar;
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d236d2b378243a5fee6865d1bad2c1b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d236d2b378243a5fee6865d1bad2c1b");
            } else {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof d) {
                    layoutParams = new d((d) layoutParams2);
                } else {
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                }
                addView(view, layoutParams);
                if (layoutParams2 != null) {
                    ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(layoutParams2.width, layoutParams2.height);
                    if (this.d != null && this.d.c != null) {
                        com.facebook.yoga.d dVar = this.d.c;
                        layoutParams3.width = (int) (layoutParams3.width + dVar.e(YogaEdge.LEFT));
                        layoutParams3.width = (int) (layoutParams3.width + dVar.e(YogaEdge.RIGHT));
                        layoutParams3.height = (int) (layoutParams3.height + dVar.e(YogaEdge.TOP));
                        layoutParams3.height = (int) (layoutParams3.height + dVar.e(YogaEdge.BOTTOM));
                    }
                    setLayoutParams(layoutParams3);
                }
            }
            Object[] objArr3 = {context, eVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ab6d5d750884dcf2c1b800849247df6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ab6d5d750884dcf2c1b800849247df6f");
                return;
            }
            this.c = new LinearLayout(context);
            this.c.setOrientation(0);
            this.c.setGravity(16);
            this.c.setClipChildren(true);
            int a2 = i.a(2.0f);
            int a3 = i.a(1.0f);
            this.c.setPadding(a2, a3, a2, a3);
            TextView textView = new TextView(context);
            textView.setTextSize(7.0f);
            textView.setTextColor(-1);
            textView.setMaxLines(4);
            DevSettings devSettings = com.sankuai.waimai.mach.common.i.a().f;
            DevSettings.LockBundleInfo a4 = devSettings != null ? devSettings.a(eVar.j) : null;
            ArrayList arrayList = new ArrayList();
            if (eVar.o) {
                arrayList.add("本地server");
            } else if (eVar.n) {
                arrayList.add("预置");
            } else if (a4 != null) {
                arrayList.add(" 🔒 ");
                arrayList.add(a4.env);
            } else {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "cd1f084a95729db3c74c0ae06e8be5d6", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "cd1f084a95729db3c74c0ae06e8be5d6");
                } else {
                    str = com.sankuai.waimai.mach.common.i.a().f != null ? com.sankuai.waimai.mach.common.i.a().f.b : false ? "test" : "prod";
                }
                arrayList.add(str);
            }
            arrayList.add(eVar.j);
            if (eVar.o) {
                this.b.setCrossFadeEnabled(true);
                this.c.setBackground(this.b);
            } else {
                if (a4 != null) {
                    arrayList.add(a4.version);
                } else {
                    arrayList.add(eVar.q.c);
                }
                this.c.setBackgroundColor(1711276287);
            }
            if (this.d != null) {
                com.sankuai.waimai.mach.node.a<?> aVar2 = this.d;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.mach.node.a.a;
                if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "ad50e0fa9efa09d459a18aeb1a6f89e0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "ad50e0fa9efa09d459a18aeb1a6f89e0")).booleanValue() : aVar2.c().y) {
                    arrayList.add("表达式3.0");
                }
            }
            if (m.c()) {
                arrayList.add("yogaOpen");
            } else {
                arrayList.add("yogaClose");
            }
            if (m.d()) {
                arrayList.add("preThreadOptOpen_" + m.g());
            } else {
                arrayList.add("preThreadOptClose");
            }
            arrayList.add(eVar.p ? "同步" : "异步");
            arrayList.add(eVar.e() ? "skipInitJSOpen" : "skipInitJSClose");
            textView.setText(TextUtils.join(" | ", arrayList));
            this.c.addView(textView);
            ImageView imageView = new ImageView(context);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i.a(10.0f), i.a(10.0f));
            layoutParams4.leftMargin = i.a(2.0f);
            imageView.setLayoutParams(layoutParams4);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.mach.debug.a.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr6 = {view2};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "eea1e6735f3b71a845ce846cdad1c958", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "eea1e6735f3b71a845ce846cdad1c958");
                    } else {
                        C1009a.this.c.setVisibility(8);
                    }
                }
            });
            try {
                imageView.setImageResource(17301560);
            } catch (Exception unused) {
                imageView.setVisibility(8);
            }
            this.c.addView(imageView);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams5.gravity = 49;
            addView(this.c, layoutParams5);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8806e0be243fe9488ab9ea12a3768d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8806e0be243fe9488ab9ea12a3768d3");
                return;
            }
            super.onAttachedToWindow();
            if (this.e.o) {
                a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e9250e1663e836c0cf60893cfd1f61d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e9250e1663e836c0cf60893cfd1f61d");
                return;
            }
            this.b.startTransition(2000);
            postDelayed(this.f, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35e4831ca8706aea4003189a4014fb67", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35e4831ca8706aea4003189a4014fb67");
                return;
            }
            super.onDetachedFromWindow();
            if (this.e.o) {
                removeCallbacks(this.f);
            }
        }
    }

    public static View a(View view, Context context, e eVar, com.sankuai.waimai.mach.node.a<?> aVar) {
        Object[] objArr = {view, context, eVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "caabb4e8b5ff035fa760e7bdff899606", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "caabb4e8b5ff035fa760e7bdff899606") : (context == null || !b || view == null) ? view : new C1009a(context, view, eVar, aVar);
    }
}
