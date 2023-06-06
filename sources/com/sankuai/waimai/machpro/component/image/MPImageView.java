package com.sankuai.waimai.machpro.component.image;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.utils.e;
import com.sankuai.waimai.machpro.monitor.c;
import com.sankuai.waimai.machpro.view.decoration.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    WeakReference<b> b;
    private String c;
    private String d;
    private d e;
    private boolean f;

    public String getSource() {
        return this.c;
    }

    public void setSource(String str) {
        this.c = str;
    }

    public MPImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02ea7a9c8a1dbdee63941f3e75e32734", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02ea7a9c8a1dbdee63941f3e75e32734");
        }
    }

    public b getComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bcd4b4dda93b80388a07154dbb9b7f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bcd4b4dda93b80388a07154dbb9b7f1");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.get();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1f6cec1c5b453cc14cb37054ea48d5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1f6cec1c5b453cc14cb37054ea48d5f");
        } else {
            super.onSizeChanged(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b7dd7695796d7c9b36b48be8e0d4b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b7dd7695796d7c9b36b48be8e0d4b0");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        final b component = getComponent();
        if (component != null) {
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, component, changeQuickRedirect2, false, "cf0984cc700ef5322000cddb02340f2d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, component, changeQuickRedirect2, false, "cf0984cc700ef5322000cddb02340f2d");
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (component.f != i5) {
                if (component.f > 0 && "heightFix".equals(component.d) && Math.abs(component.f - i5) <= 1) {
                    StringBuilder sb = new StringBuilder("image.src = ");
                    sb.append(component.b.c);
                    sb.append(" | scaletype = ");
                    sb.append(component.d);
                    sb.append(" | oldwidth = ");
                    sb.append(component.f);
                    sb.append(" | newWidth = ");
                    sb.append(i5);
                } else {
                    component.f = i5;
                    component.c = true;
                }
            }
            if (component.g != i6) {
                if (component.g > 0 && "widthFix".equals(component.d) && Math.abs(component.g - i6) <= 1) {
                    StringBuilder sb2 = new StringBuilder("image.src = ");
                    sb2.append(component.b.c);
                    sb2.append(" | scaletype = ");
                    sb2.append(component.d);
                    sb2.append(" | oldHeight = ");
                    sb2.append(component.g);
                    sb2.append(" | newheight = ");
                    sb2.append(i6);
                } else {
                    component.g = i6;
                    component.c = true;
                }
            }
            if (component.c) {
                component.c = false;
                component.e.post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.image.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca375227e8d6c65c271accac695a7e23", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca375227e8d6c65c271accac695a7e23");
                        } else {
                            component.c();
                        }
                    }
                });
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dd2bbecb3f8476c1e91ba98a56b5ed9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dd2bbecb3f8476c1e91ba98a56b5ed9");
            return;
        }
        try {
            Object[] objArr2 = {canvas};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0edaf7d8f423e7431ba5892d95fec82", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0edaf7d8f423e7431ba5892d95fec82");
            } else {
                this.f = false;
                b component = getComponent();
                if (component != null) {
                    String boxShadow = component.getBoxShadow();
                    if (TextUtils.isEmpty(boxShadow)) {
                        this.d = "";
                    } else {
                        if (!boxShadow.equals(this.d)) {
                            this.d = boxShadow;
                            String[] split = this.d.split("\\s+");
                            if (split.length == 4) {
                                this.e = new d(split);
                            }
                        }
                        if (this.e != null) {
                            this.e.a(getWidth(), getHeight());
                            this.e.a(component.getBorderRadii());
                            this.e.a(canvas);
                            this.f = true;
                        }
                    }
                }
            }
            super.draw(canvas);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("Image View draw exception!" + e.getMessage());
            HashMap hashMap = new HashMap();
            if (getComponent() != null) {
                b component2 = getComponent();
                hashMap.put(LogMonitor.EXCEPTION_TAG, e.getMessage());
                hashMap.put("height", Integer.valueOf(component2.g));
                hashMap.put("width", Integer.valueOf(component2.f));
                hashMap.put("ScaleType", component2.d);
                if (component2.b != null) {
                    hashMap.put("imageUrl", component2.b.c);
                }
                if (getDrawable() != null) {
                    hashMap.put("bitmapHeight", Integer.valueOf(getDrawable().getIntrinsicHeight()));
                    hashMap.put("bitmapWidth", Integer.valueOf(getDrawable().getIntrinsicWidth()));
                }
                if ((getDrawable() instanceof BitmapDrawable) && ((BitmapDrawable) getDrawable()).getBitmap() != null) {
                    hashMap.put("bitmapSize", Integer.valueOf(((BitmapDrawable) getDrawable()).getBitmap().getByteCount()));
                }
            }
            c a2 = c.a();
            String hashMap2 = hashMap.toString();
            Object[] objArr3 = {"MPImageView draw exception", hashMap2};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "5fed9d4c4e3e3129dffb65547cea09e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "5fed9d4c4e3e3129dffb65547cea09e8");
            } else if (TextUtils.isEmpty("MPImageView draw exception") || TextUtils.isEmpty(hashMap2)) {
            } else {
                Map<String, String> b = a2.b();
                b.put("tag", "MPImageView draw exception");
                b.put("message", hashMap2);
                if (a2.b != null) {
                    a2.b.a(a2.getClass(), "MPImageView draw exception", e.b(b));
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dc0194f571c009df74c005cae1c2397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dc0194f571c009df74c005cae1c2397");
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipRect(0, 0, getRight() - getLeft(), getBottom() - getTop());
        super.onDraw(canvas);
        b component = getComponent();
        if (component != null) {
            component.getBackgroundDrawable().a(canvas);
        }
        canvas.restoreToCount(saveCount);
    }
}
