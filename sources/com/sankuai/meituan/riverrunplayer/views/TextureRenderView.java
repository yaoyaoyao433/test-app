package com.sankuai.meituan.riverrunplayer.views;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TextureRenderView extends TextureView {
    public static ChangeQuickRedirect a;
    private com.sankuai.meituan.riverrunplayer.views.a b;
    private b c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(@NonNull SurfaceTexture surfaceTexture, int i, int i2);

        void a(@NonNull SurfaceTexture surfaceTexture, int i, int i2, int i3);

        boolean a(@NonNull SurfaceTexture surfaceTexture);
    }

    public View getActualView() {
        return this;
    }

    public TextureRenderView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ae70fe16bc89444a4d6515d09b587c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ae70fe16bc89444a4d6515d09b587c2");
        } else {
            a();
        }
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8170805f09918a9dea3300d73847df5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8170805f09918a9dea3300d73847df5");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48ec8887673c8070ff8e15d5648b6b92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48ec8887673c8070ff8e15d5648b6b92");
            return;
        }
        this.b = new com.sankuai.meituan.riverrunplayer.views.a(this);
        this.c = new b();
        setSurfaceTextureListener(this.c);
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73075e4f4d3b19f72cc11559b13e758", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73075e4f4d3b19f72cc11559b13e758");
        } else if (i <= 0 || i2 <= 0) {
        } else {
            this.b.a(i, i2);
            requestLayout();
        }
    }

    public final void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2bd3b9443fe40191339ca1b07ef3c6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2bd3b9443fe40191339ca1b07ef3c6c");
        } else if (i <= 0 || i2 <= 0) {
        } else {
            this.b.b(i, i2);
            requestLayout();
        }
    }

    public void setVideoRotation(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a073e9454d0f8a82f18385d5614d9ee6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a073e9454d0f8a82f18385d5614d9ee6");
            return;
        }
        this.b.g = i;
        setRotation(i);
    }

    public void setAspectRatio(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dfb7afa6052f36b9758ec0b21377760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dfb7afa6052f36b9758ec0b21377760");
            return;
        }
        this.b.j = i;
        requestLayout();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view;
        int i3;
        int i4;
        int i5;
        float f;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "492c0b2b918f326a8ac79f6b8e2bff80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "492c0b2b918f326a8ac79f6b8e2bff80");
            return;
        }
        com.sankuai.meituan.riverrunplayer.views.a aVar = this.b;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.riverrunplayer.views.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a15fa0c70b0bdaee7a96a764996259a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a15fa0c70b0bdaee7a96a764996259a9");
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.riverrunplayer.views.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "a289cd7c61c1a12f5d0e95d10e28bee5", RobustBitConfig.DEFAULT_VALUE)) {
                view = (View) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "a289cd7c61c1a12f5d0e95d10e28bee5");
            } else {
                view = aVar.b == null ? null : aVar.b.get();
            }
            if (view != null) {
                if (aVar.g == 90 || aVar.g == 270) {
                    i3 = i;
                    i4 = i2;
                } else {
                    i4 = i;
                    i3 = i2;
                }
                int defaultSize = View.getDefaultSize(aVar.c, i4);
                int defaultSize2 = View.getDefaultSize(aVar.d, i3);
                if (aVar.c > 0 && aVar.d > 0) {
                    int mode = View.MeasureSpec.getMode(i4);
                    i5 = View.MeasureSpec.getSize(i4);
                    int mode2 = View.MeasureSpec.getMode(i3);
                    int size = View.MeasureSpec.getSize(i3);
                    if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                        float f2 = i5;
                        float f3 = size;
                        float f4 = f2 / f3;
                        switch (aVar.j) {
                            case 2:
                                f = 1.7777778f;
                                if (aVar.g == 90 || aVar.g == 270) {
                                    f = 0.5625f;
                                    break;
                                }
                                break;
                            case 3:
                                f = 1.3333334f;
                                if (aVar.g == 90 || aVar.g == 270) {
                                    f = 0.75f;
                                    break;
                                }
                                break;
                            default:
                                f = aVar.c / aVar.d;
                                if (aVar.e > 0 && aVar.f > 0) {
                                    f = (f * aVar.e) / aVar.f;
                                    break;
                                }
                                break;
                        }
                        boolean z = f > f4;
                        switch (aVar.j) {
                            case 0:
                                if (!z) {
                                    defaultSize2 = (int) (f2 / f);
                                    break;
                                } else {
                                    defaultSize = (int) (f3 * f);
                                    defaultSize2 = size;
                                    break;
                                }
                            case 1:
                            case 2:
                            case 3:
                                if (!z) {
                                    defaultSize = (int) (f3 * f);
                                    defaultSize2 = size;
                                    break;
                                } else {
                                    defaultSize2 = (int) (f2 / f);
                                    break;
                                }
                            default:
                                if (z) {
                                    defaultSize = Math.min(aVar.c, i5);
                                    defaultSize2 = (int) (defaultSize / f);
                                    break;
                                } else {
                                    defaultSize2 = Math.min(aVar.d, size);
                                    defaultSize = (int) (defaultSize2 * f);
                                    break;
                                }
                        }
                    } else if (mode == 1073741824 && mode2 == 1073741824) {
                        if (aVar.c * size < aVar.d * i5) {
                            defaultSize = (aVar.c * size) / aVar.d;
                            defaultSize2 = size;
                        } else {
                            if (aVar.c * size > aVar.d * i5) {
                                defaultSize2 = (aVar.d * i5) / aVar.c;
                            }
                            defaultSize2 = size;
                        }
                    } else if (mode == 1073741824) {
                        int i6 = (aVar.d * i5) / aVar.c;
                        if (mode2 != Integer.MIN_VALUE || i6 <= size) {
                            defaultSize2 = i6;
                        }
                        defaultSize2 = size;
                    } else if (mode2 == 1073741824) {
                        int i7 = (aVar.c * size) / aVar.d;
                        if (mode != Integer.MIN_VALUE || i7 <= i5) {
                            i5 = i7;
                        }
                        defaultSize2 = size;
                    } else {
                        int i8 = aVar.c;
                        int i9 = aVar.d;
                        if (mode2 != Integer.MIN_VALUE || i9 <= size) {
                            defaultSize2 = i9;
                        } else {
                            i8 = (aVar.c * size) / aVar.d;
                            defaultSize2 = size;
                        }
                        if (mode != Integer.MIN_VALUE || i8 <= i5) {
                            i5 = i8;
                        } else {
                            defaultSize2 = (aVar.d * i5) / aVar.c;
                        }
                    }
                    aVar.h = i5;
                    aVar.i = defaultSize2;
                    StringBuilder sb = new StringBuilder("mMeasuredWidth: ");
                    sb.append(aVar.h);
                    sb.append(" ,mMeasuredHeight: ");
                    sb.append(aVar.i);
                }
                i5 = defaultSize;
                aVar.h = i5;
                aVar.i = defaultSize2;
                StringBuilder sb2 = new StringBuilder("mMeasuredWidth: ");
                sb2.append(aVar.h);
                sb2.append(" ,mMeasuredHeight: ");
                sb2.append(aVar.i);
            }
        }
        setMeasuredDimension(this.b.h, this.b.i);
    }

    public void setRenderCallback(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f85b6a24ef7b81e3670e355666c81e67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f85b6a24ef7b81e3670e355666c81e67");
        } else {
            this.c.b = aVar;
        }
    }

    public final boolean a(SurfaceTexture surfaceTexture) {
        Object[] objArr = {surfaceTexture};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73c8ce4c565f50268f87fe2a97ce671a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73c8ce4c565f50268f87fe2a97ce671a")).booleanValue();
        }
        try {
            setSurfaceTexture(surfaceTexture);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class b implements TextureView.SurfaceTextureListener {
        public static ChangeQuickRedirect a;
        a b;

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public b() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Object[] objArr = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2bea9babbc08a921b91e5d87192dfb8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2bea9babbc08a921b91e5d87192dfb8");
                return;
            }
            StringBuilder sb = new StringBuilder("onSurfaceTextureAvailable width: ");
            sb.append(i);
            sb.append(" , height: ");
            sb.append(i2);
            if (this.b != null) {
                this.b.a(surfaceTexture, i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Object[] objArr = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0704daa1030fa7496548c0bdcbca060e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0704daa1030fa7496548c0bdcbca060e");
                return;
            }
            StringBuilder sb = new StringBuilder("onSurfaceTextureSizeChanged width: ");
            sb.append(i);
            sb.append(" , height: ");
            sb.append(i2);
            if (this.b != null) {
                this.b.a(surfaceTexture, 0, i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Object[] objArr = {surfaceTexture};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aa64834b5beeb308d3c0ae77a72bddc", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aa64834b5beeb308d3c0ae77a72bddc")).booleanValue();
            }
            if (this.b != null) {
                return this.b.a(surfaceTexture);
            }
            return true;
        }
    }
}
