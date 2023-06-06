package com.sankuai.waimai.business.restaurant.poicontainer.machpro.rooimage;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.f;
import com.sankuai.waimai.machpro.view.decoration.d;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPRooImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    WeakReference<a> b;
    private String c;
    private String d;
    private d e;

    public String getSource() {
        return this.c;
    }

    public void setSource(String str) {
        this.c = str;
    }

    public MPRooImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5c0f8b6a62a8ff363ec940572a0901d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5c0f8b6a62a8ff363ec940572a0901d");
        }
    }

    public a getComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5a1e75a6c086f820a96e793d555b0a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5a1e75a6c086f820a96e793d555b0a2");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f23d2872d658582affdb49ec5d625249", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f23d2872d658582affdb49ec5d625249");
        } else {
            super.onSizeChanged(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, final int i, final int i2, final int i3, final int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5c34fbcb3a8516dc1bcf4de2b884063", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5c34fbcb3a8516dc1bcf4de2b884063");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        final a component = getComponent();
        if (component != null) {
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, component, changeQuickRedirect2, false, "0e2fff94070b3ed2ea9b7c5e0b966d7e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, component, changeQuickRedirect2, false, "0e2fff94070b3ed2ea9b7c5e0b966d7e");
                return;
            }
            component.e = i3 - i;
            component.f = i4 - i2;
            if (component.c) {
                component.c = false;
                component.d.post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.rooimage.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "649085d9510c221f509570a9702fbeec", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "649085d9510c221f509570a9702fbeec");
                            return;
                        }
                        if (!component.h) {
                            if (component.i != null) {
                                component.b.e = component.i;
                            } else {
                                int i5 = i3 - i;
                                int i6 = i4 - i2;
                                if (i5 >= i6) {
                                    component.b.e = new int[]{i5, 0};
                                } else {
                                    component.b.e = new int[]{0, i6};
                                }
                            }
                        } else {
                            component.b.e = null;
                            component.b.f = -1;
                        }
                        component.b.i = component.getBorderRadii();
                        component.b.j = component.m;
                        component.b.l = i4 - i2;
                        component.b.k = i3 - i;
                        if (!TextUtils.isEmpty(component.n)) {
                            component.b.c = component.n;
                            component.b.d = 1;
                        }
                        com.sankuai.waimai.machpro.adapter.a aVar = f.a().b;
                        if (aVar != null) {
                            a.a(component, false);
                            aVar.a(component.b, component);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15f25937ff69b3952ea600c98cd64bdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15f25937ff69b3952ea600c98cd64bdf");
            return;
        }
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de4ebefe4d7fbd83cd3ef08b406a35a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de4ebefe4d7fbd83cd3ef08b406a35a2");
        } else {
            a component = getComponent();
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
                    }
                }
            }
        }
        super.draw(canvas);
    }
}
