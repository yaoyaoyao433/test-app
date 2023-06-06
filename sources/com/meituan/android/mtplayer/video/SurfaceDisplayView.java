package com.meituan.android.mtplayer.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class SurfaceDisplayView extends SurfaceView implements d {
    public static ChangeQuickRedirect a;
    private k b;
    private e c;
    private b d;
    private SurfaceHolder e;
    private a f;

    @Override // com.meituan.android.mtplayer.video.d
    public final boolean a() {
        return true;
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final View getView() {
        return this;
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final void setDisplayOpaque(boolean z) {
    }

    public SurfaceDisplayView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "274e6c540dbcb75809b0c61e5a18de9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "274e6c540dbcb75809b0c61e5a18de9d");
        }
    }

    private SurfaceDisplayView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc905d6358ba1f1939e98e92755b7d01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc905d6358ba1f1939e98e92755b7d01");
        }
    }

    public SurfaceDisplayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b032b9f5f8eeb3aca35d4ee8539e11ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b032b9f5f8eeb3aca35d4ee8539e11ca");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75aba394ad541eb57fef731beae929bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75aba394ad541eb57fef731beae929bf");
            return;
        }
        this.b = new k();
        this.c = new e();
        this.d = new b();
        this.f = new a();
        getHolder().addCallback(this.d);
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final Bitmap getVideoBitmap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc7e134e282948566a186344cacd4970", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc7e134e282948566a186344cacd4970") : getDrawingCache();
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e868db032268ea4efef37a9639ff99ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e868db032268ea4efef37a9639ff99ae");
        } else {
            b.a(this.d, cVar);
        }
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final void b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f07cd582d8144e453576be0e99b4a87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f07cd582d8144e453576be0e99b4a87");
        } else {
            b.b(this.d, cVar);
        }
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8196c7653c3922a9deda41c062372021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8196c7653c3922a9deda41c062372021");
        } else if (i <= 0 || i2 <= 0) {
        } else {
            this.b.a(i, i2);
            getHolder().setFixedSize(i, i2);
            requestLayout();
        }
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd4f5d0246dfd6e598526aca4ba66fab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd4f5d0246dfd6e598526aca4ba66fab");
            return;
        }
        k kVar = this.b;
        kVar.b = i;
        kVar.c = i2;
        requestLayout();
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final void setVideoDisplayMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16b3eb34d719084c0a3ac3c65641ccf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16b3eb34d719084c0a3ac3c65641ccf2");
            return;
        }
        this.b.g = i;
        this.c.b = i;
        requestLayout();
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final void setVideoRotation(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6057349607585239764059746558d41e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6057349607585239764059746558d41e");
        } else {
            com.meituan.android.mtplayer.video.utils.c.a("SurfaceView doesn't support rotation");
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7730fd18ab796671dbd73485075b35d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7730fd18ab796671dbd73485075b35d");
            return;
        }
        this.b.b(i, i2);
        setMeasuredDimension(this.b.e, this.b.f);
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2642f761ee6771735cf6ee1033cdc31f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2642f761ee6771735cf6ee1033cdc31f");
            return;
        }
        Rect a2 = this.c.a(i, i2, i3, i4);
        super.layout(a2.left, a2.top, a2.right, a2.bottom);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public final class a implements com.meituan.android.mtplayer.video.b {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mtplayer.video.b
        public final void a() {
        }

        private a() {
            Object[] objArr = {SurfaceDisplayView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5658c1da8a81b9ec92a794bcd6fcdfd7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5658c1da8a81b9ec92a794bcd6fcdfd7");
            }
        }

        @Override // com.meituan.android.mtplayer.video.b
        public final void a(com.meituan.android.mtplayer.video.player.d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a74d9ff5a9525a329a1456b87d2f2cc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a74d9ff5a9525a329a1456b87d2f2cc");
            } else if (dVar == null) {
            } else {
                dVar.setDisplay(SurfaceDisplayView.this.e);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b implements SurfaceHolder.Callback {
        public static ChangeQuickRedirect a;
        private boolean c;
        private int d;
        private int e;
        private int f;
        private List<c> g;

        private b() {
            Object[] objArr = {SurfaceDisplayView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2abda59133d96da8bf60f9f5cb529351", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2abda59133d96da8bf60f9f5cb529351");
            } else {
                this.g = new ArrayList();
            }
        }

        public static /* synthetic */ void a(b bVar, c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "54674a700422c363771aca09cefd1739", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "54674a700422c363771aca09cefd1739");
                return;
            }
            bVar.g.add(cVar);
            if (SurfaceDisplayView.this.e != null) {
                cVar.a(SurfaceDisplayView.this.f, bVar.e, bVar.f);
            }
            if (bVar.c) {
                cVar.a(SurfaceDisplayView.this.f, 0, bVar.e, bVar.f);
            }
        }

        public static /* synthetic */ void b(b bVar, c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "9aeada8eaa8906e403449a4b54a69efa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "9aeada8eaa8906e403449a4b54a69efa");
            } else {
                bVar.g.remove(cVar);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            Object[] objArr = {surfaceHolder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b08b3c8c3cd77da4538af6b079ab949", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b08b3c8c3cd77da4538af6b079ab949");
                return;
            }
            SurfaceDisplayView.this.e = surfaceHolder;
            this.c = false;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            for (c cVar : this.g) {
                cVar.a(SurfaceDisplayView.this.f, this.e, this.f);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            Object[] objArr = {surfaceHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43c4b50eecde9b3908e3adde813b68cc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43c4b50eecde9b3908e3adde813b68cc");
                return;
            }
            SurfaceDisplayView.this.e = surfaceHolder;
            this.c = true;
            this.d = i;
            this.e = i2;
            this.f = i3;
            for (c cVar : this.g) {
                cVar.a(SurfaceDisplayView.this.f, this.d, this.e, this.f);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Object[] objArr = {surfaceHolder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dc5fae5d3f90f11e9c466b8bb93d736", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dc5fae5d3f90f11e9c466b8bb93d736");
                return;
            }
            SurfaceDisplayView.this.e = surfaceHolder;
            this.c = false;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            for (c cVar : this.g) {
                cVar.a(SurfaceDisplayView.this.f);
            }
        }
    }
}
