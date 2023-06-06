package com.sankuai.ehcore.module.core;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.support.constraint.R;
import android.view.View;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.ehcore.util.c;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g extends FrameLayout {
    public static ChangeQuickRedirect a;
    public View b;
    public Animation c;
    public Animation d;
    public int e;
    private ImageView f;
    private Activity g;
    private a h;
    private boolean i;

    public g(Context context, View view, a aVar) {
        super(context);
        Object[] objArr = {context, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63f8c3bbd61b23f61446ab2a2df5c61c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63f8c3bbd61b23f61446ab2a2df5c61c");
            return;
        }
        this.e = 0;
        this.i = true;
        if (context instanceof Activity) {
            this.g = (Activity) context;
        }
        this.h = aVar;
        this.b = view;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2eff58594054f41dc9afb42c65c50f05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2eff58594054f41dc9afb42c65c50f05");
            return;
        }
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setId(R.id.eh_layout);
        this.f = new ImageView(getContext());
        this.f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f.setVisibility(4);
        addView(this.f);
        addView(this.b);
        this.c = com.sankuai.ehcore.util.c.a(10, new c.a() { // from class: com.sankuai.ehcore.module.core.g.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.ehcore.util.c.a
            public final void a(Animation animation) {
                Object[] objArr3 = {animation};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "db4854d6a8551714f74214c8f9056add", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "db4854d6a8551714f74214c8f9056add");
                } else {
                    g.this.b.setVisibility(0);
                }
            }

            @Override // com.sankuai.ehcore.util.c.a
            public final void b(Animation animation) {
                Object[] objArr3 = {animation};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bf21938235cbbf86b00f72f4ac53c821", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bf21938235cbbf86b00f72f4ac53c821");
                } else {
                    g.this.f.setVisibility(4);
                }
            }
        });
        this.d = com.sankuai.ehcore.util.c.a(11, new c.a() { // from class: com.sankuai.ehcore.module.core.g.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.ehcore.util.c.a
            public final void a(Animation animation) {
                Object[] objArr3 = {animation};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fd13b019768a00c162f6fd23f4b95935", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fd13b019768a00c162f6fd23f4b95935");
                    return;
                }
                g.this.f.bringToFront();
                g.this.b.setVisibility(0);
            }

            @Override // com.sankuai.ehcore.util.c.a
            public final void b(Animation animation) {
                Object[] objArr3 = {animation};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fadd47273d85cad22b600852e05a926a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fadd47273d85cad22b600852e05a926a");
                    return;
                }
                g.this.f.setVisibility(4);
                g.this.b.bringToFront();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08823059465c1e43c51421b8b04e94da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08823059465c1e43c51421b8b04e94da");
            return;
        }
        super.onDetachedFromWindow();
        if (this.h != null) {
            try {
                com.sankuai.eh.component.service.tools.d.b("------------ContentView Detached---------------");
                a aVar = this.h;
                Object[] objArr2 = {11};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "487a975852e1ec7aa9b17b4dc9b6d9d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "487a975852e1ec7aa9b17b4dc9b6d9d4");
                } else if (aVar.e != null && com.sankuai.eh.component.service.utils.d.b(aVar.f) && aVar.g.d != 0) {
                    aVar.g.b = true;
                    aVar.g.a(aVar.e, 11);
                }
                com.sankuai.ehcore.a.a(this.h);
            } catch (Exception e) {
                com.sankuai.eh.component.service.tools.d.a(e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f1733ed9005597d215c756aafb77a9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f1733ed9005597d215c756aafb77a9c");
            return;
        }
        super.onAttachedToWindow();
        com.sankuai.eh.component.service.tools.d.b("------------ContentView Attached---------------");
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        Bitmap bitmap;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d9e08a3d4812434c08f7b3f739bf36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d9e08a3d4812434c08f7b3f739bf36");
            return;
        }
        super.onWindowFocusChanged(z);
        if (this.h == null || z) {
            return;
        }
        try {
            if (this.g.isFinishing()) {
                com.sankuai.eh.component.service.tools.d.b("------------windowFocusChange finish---------------");
                this.h.e().a("at_monitor_close");
                this.h.b();
                a aVar = this.h;
                Object[] objArr2 = {11};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "7e3900c0a377f94fc86fbba9be591e68", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "7e3900c0a377f94fc86fbba9be591e68");
                } else if (aVar.e == null || !com.sankuai.eh.component.service.utils.d.b(aVar.f) || aVar.g.d == 0) {
                } else {
                    com.sankuai.ehcore.detector.a aVar2 = aVar.g;
                    WebView webView = aVar.e;
                    Object[] objArr3 = {webView};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.ehcore.detector.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "e9acc05ce0a53e62c07c2a86ba728fc4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "e9acc05ce0a53e62c07c2a86ba728fc4");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    Object[] objArr4 = {webView};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.ehcore.detector.a.a;
                    if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "5cc151a654a0c4db30380482c34518b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "5cc151a654a0c4db30380482c34518b5");
                    } else {
                        aVar2.h = new JSONObject();
                        com.sankuai.ehcore.detector.a.a(aVar2.h, aVar2.f);
                        com.sankuai.ehcore.detector.a.a(aVar2.h, webView);
                    }
                    Object[] objArr5 = {webView};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.ehcore.detector.a.a;
                    if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "bd939814dcf0992128f7c2b00e715176", RobustBitConfig.DEFAULT_VALUE)) {
                        bitmap = (Bitmap) PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "bd939814dcf0992128f7c2b00e715176");
                    } else {
                        bitmap = null;
                        if (webView != null) {
                            if (Build.VERSION.SDK_INT < 26) {
                                aVar2.c = 4;
                            }
                            float f = 1.0f / aVar2.c;
                            Bitmap createBitmap = Bitmap.createBitmap((int) (webView.getWidth() * f), (int) (webView.getHeight() * f), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            canvas.scale(f, f);
                            webView.draw(canvas);
                            canvas.setBitmap(null);
                            bitmap = createBitmap;
                        }
                        if (bitmap == null) {
                            bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
                        }
                    }
                    aVar2.g = bitmap;
                    aVar2.e = System.currentTimeMillis() - currentTimeMillis;
                }
            }
        } catch (Exception e) {
            com.sankuai.eh.component.service.tools.d.a(e);
        }
    }
}
