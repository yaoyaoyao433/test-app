package com.sankuai.waimai.ugc.creator.component;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.ugc.library.c;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.utils.n;
import com.sankuai.waimai.ugc.creator.utils.o;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends com.sankuai.waimai.ugc.creator.base.b {
    public static ChangeQuickRedirect a;
    private View b;

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26e6bdb9e75fe41f9353d2489fdda3a3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26e6bdb9e75fe41f9353d2489fdda3a3") : layoutInflater.inflate(R.layout.wm_ugc_camera_photo_control_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efa16fa68c21d9efa6dc2b61747ccd83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efa16fa68c21d9efa6dc2b61747ccd83");
            return;
        }
        super.a(view);
        this.b = b(R.id.photo_camera_control_btn);
        this.b.setOnClickListener(new com.sankuai.waimai.ugc.creator.widgets.a() { // from class: com.sankuai.waimai.ugc.creator.component.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.widgets.a
            public final void a(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5676e02d21623e3969550bd4842dc571", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5676e02d21623e3969550bd4842dc571");
                    return;
                }
                com.sankuai.waimai.ugc.creator.judas.e a2 = com.sankuai.waimai.ugc.creator.judas.e.a();
                Activity B = c.this.B();
                Object[] objArr3 = {B};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.ugc.creator.judas.e.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d937b2cd779b06528e644daac969b1c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d937b2cd779b06528e644daac969b1c8");
                } else if (a2.b != null) {
                    a2.a(a2.b.m, a2.b.c, (Map<String, Object>) null, B);
                }
                final com.sankuai.waimai.ugc.creator.manager.g a3 = com.sankuai.waimai.ugc.creator.manager.g.a();
                final Context A = c.this.A();
                Object[] objArr4 = {A};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.ugc.creator.manager.g.a;
                if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "0a4c6ed0236d166c463b404e6b5b42d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "0a4c6ed0236d166c463b404e6b5b42d8");
                } else if (a3.b == null || a3.e || a3.f) {
                    n.a("snapshot->IMTUgcRecord is null");
                    a3.b(-200);
                } else {
                    a3.f = true;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.ugc.creator.manager.g.a;
                    if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "6a590f66a212213b7e35f282abbe3a0b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "6a590f66a212213b7e35f282abbe3a0b");
                    } else if (a3.d != null) {
                        a3.d.f();
                    }
                    a3.b.a(new c.a() { // from class: com.sankuai.waimai.ugc.creator.manager.g.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtlive.ugc.library.c.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr6 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "60d0fec06becb49e85331a5b958d5db6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "60d0fec06becb49e85331a5b958d5db6");
                            } else if (o.a(A)) {
                                Context context = A;
                                Object[] objArr7 = {context, bitmap};
                                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.ugc.creator.utils.f.a;
                                final ImageData imageData = null;
                                if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "d0bd8e7f40feea88edb59f713680c4e6", RobustBitConfig.DEFAULT_VALUE)) {
                                    imageData = (ImageData) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "d0bd8e7f40feea88edb59f713680c4e6");
                                } else if (bitmap != null && !bitmap.isRecycled()) {
                                    String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.CHINA).format(new Date());
                                    Cursor a4 = com.sankuai.waimai.ugc.creator.ability.album.utils.a.a(context, Uri.parse(MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "wm_ugc_photo_" + format, (String) null)));
                                    if (a4 != null) {
                                        List<ImageData> a5 = com.sankuai.waimai.ugc.creator.ability.album.utils.a.a(a4, true);
                                        if (!com.sankuai.waimai.foundation.utils.b.b(a5)) {
                                            imageData = a5.get(0);
                                        }
                                    }
                                }
                                com.sankuai.waimai.ugc.creator.utils.task.b.b(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.manager.g.2.1
                                    public static ChangeQuickRedirect a;

                                    {
                                        AnonymousClass2.this = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr8 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect8 = a;
                                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "391cb51de4ac8a604326af67068d7a61", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "391cb51de4ac8a604326af67068d7a61");
                                            return;
                                        }
                                        g.a(a3, false);
                                        g.b(a3);
                                        if (TextUtils.isEmpty(imageData.i)) {
                                            a3.b(-210);
                                            return;
                                        }
                                        imageData.r = com.sankuai.waimai.ugc.creator.utils.f.a(imageData.i);
                                        g.a(a3, imageData);
                                    }
                                });
                            }
                        }
                    });
                }
            }
        });
    }
}
