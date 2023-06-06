package com.sankuai.meituan.riverrunplayer.views;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.support.annotation.NonNull;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.riverrunplayer.views.TextureRenderView;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b extends FrameLayout {
    public static ChangeQuickRedirect a = null;
    private static final String c = "b";
    public TextureRenderView b;
    private TextureRenderView.a d;
    private Context e;
    private ConcurrentHashMap<Integer, a> f;

    public b(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a228e7a2aee11ad5d170c69bc98e80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a228e7a2aee11ad5d170c69bc98e80");
            return;
        }
        this.f = new ConcurrentHashMap<>();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1e02abfa1b25890877d3e436787d530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1e02abfa1b25890877d3e436787d530");
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            this.b = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9fba54d6eea50618c63d8269da3c0ce4", RobustBitConfig.DEFAULT_VALUE) ? (TextureRenderView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9fba54d6eea50618c63d8269da3c0ce4") : new TextureRenderView(getContext());
            this.b.setRenderCallback(new TextureRenderView.a() { // from class: com.sankuai.meituan.riverrunplayer.views.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.riverrunplayer.views.TextureRenderView.a
                public final void a(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
                    Object[] objArr4 = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "158b8fb92fbf52b92ffa4dddc7c8b471", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "158b8fb92fbf52b92ffa4dddc7c8b471");
                        return;
                    }
                    String unused = b.c;
                    StringBuilder sb = new StringBuilder("onSurfaceCreated  width: ");
                    sb.append(i);
                    sb.append(" , height: ");
                    sb.append(i2);
                    if (b.this.d != null) {
                        b.this.d.a(surfaceTexture, i, i2);
                        return;
                    }
                    a aVar = new a();
                    aVar.b = i;
                    aVar.c = i2;
                    aVar.a = surfaceTexture;
                    aVar.d = 0;
                    b.this.f.put(0, aVar);
                }

                @Override // com.sankuai.meituan.riverrunplayer.views.TextureRenderView.a
                public final void a(@NonNull SurfaceTexture surfaceTexture, int i, int i2, int i3) {
                    Object[] objArr4 = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0a5368c579276394d36fb0cf82c85824", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0a5368c579276394d36fb0cf82c85824");
                        return;
                    }
                    String unused = b.c;
                    StringBuilder sb = new StringBuilder("onSurfaceChanged  width: ");
                    sb.append(i2);
                    sb.append(" , height: ");
                    sb.append(i3);
                    if (b.this.d != null) {
                        b.this.d.a(surfaceTexture, i, i2, i3);
                        return;
                    }
                    a aVar = new a();
                    aVar.b = i2;
                    aVar.c = i3;
                    aVar.a = surfaceTexture;
                    aVar.d = i;
                    b.this.f.put(1, aVar);
                }

                @Override // com.sankuai.meituan.riverrunplayer.views.TextureRenderView.a
                public final boolean a(@NonNull SurfaceTexture surfaceTexture) {
                    Object[] objArr4 = {surfaceTexture};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0b067af7fbf1532811aa3dec97f06861", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0b067af7fbf1532811aa3dec97f06861")).booleanValue();
                    }
                    b.this.f.clear();
                    if (b.this.d != null) {
                        return b.this.d.a(surfaceTexture);
                    }
                    return true;
                }
            });
            addView(this.b, new FrameLayout.LayoutParams(-1, -1, 17));
        }
        this.e = context;
    }

    public void setRenderCallback(TextureRenderView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07a9f8698ee9f20fe0a1ad9564b19cdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07a9f8698ee9f20fe0a1ad9564b19cdf");
            return;
        }
        this.d = aVar;
        if (this.d != null) {
            if (this.f.isEmpty()) {
                return;
            }
            a remove = this.f.remove(0);
            if (remove != null && this.d != null) {
                this.d.a(remove.a, remove.b, remove.c);
            }
            a remove2 = this.f.remove(1);
            if (remove2 == null || this.d == null) {
                return;
            }
            this.d.a(remove2.a, remove2.d, remove2.b, remove2.c);
            return;
        }
        this.f.clear();
    }

    public TextureRenderView getRenderView() {
        return this.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a {
        public SurfaceTexture a;
        public int b;
        public int c;
        public int d;

        public a() {
        }
    }
}
