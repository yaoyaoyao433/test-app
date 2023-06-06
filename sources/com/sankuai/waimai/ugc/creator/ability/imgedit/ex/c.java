package com.sankuai.waimai.ugc.creator.ability.imgedit.ex;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.utils.g;
import com.sankuai.waimai.ugc.creator.utils.k;
import com.sankuai.waimai.ugc.creator.widgets.WatchedImageView;
import com.sankuai.waimai.ugc.creator.widgets.tag.TagBoard;
import com.sankuai.waimai.ugc.creator.widgets.tag.TagData;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.ugc.creator.base.b implements WatchedImageView.a, TagBoard.a {
    public static ChangeQuickRedirect a;
    TagBoard b;
    ImageData c;
    public int d;
    Bitmap e;
    private WatchedImageView f;
    private ArrayList<ImageData> g;
    private String h;
    private boolean i;
    private float j;
    private float k;
    private int l;
    private String m;

    public c(Fragment fragment) {
        super(fragment);
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe56d19dd677eb8bb45b034ad3145989", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe56d19dd677eb8bb45b034ad3145989");
            return;
        }
        this.i = false;
        this.j = 0.5f;
        this.k = 0.5f;
        this.l = 1;
        this.m = Integer.toHexString(System.identityHashCode(this));
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06c3c61d0e4ead83c2e2da3b50ad4393", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06c3c61d0e4ead83c2e2da3b50ad4393") : layoutInflater.inflate(R.layout.wm_ugc_image_editor_display_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83b4a156a212cfc2d8fda391d3006bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83b4a156a212cfc2d8fda391d3006bc");
            return;
        }
        this.f = (WatchedImageView) b(R.id.image_editor_image_view);
        if (this.i) {
            this.f.setOnImageDisplayChangeListener(this);
            this.b = (TagBoard) b(R.id.image_editor_tag_board);
            this.b.setVisibility(0);
            this.b.setCallback(this);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff576d5ce5b24ef50ad110b2ebf3adc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff576d5ce5b24ef50ad110b2ebf3adc9");
        } else if (this.c != null) {
            if (!TextUtils.isEmpty(this.c.h)) {
                String str = this.c.h;
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f9b6deff94a4f22dec1b563a2bcfa46c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f9b6deff94a4f22dec1b563a2bcfa46c");
                } else {
                    Picasso.g(A()).d(str).a(new k() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.c.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.ugc.creator.utils.k, com.squareup.picasso.Target
                        public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                            Object[] objArr4 = {bitmap, loadedFrom};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "50b1e7803952eed51bdcc2c25df48f31", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "50b1e7803952eed51bdcc2c25df48f31");
                                return;
                            }
                            c.this.e = bitmap;
                            c.this.a(bitmap);
                        }
                    });
                }
            } else if (TextUtils.isEmpty(this.c.j)) {
            } else {
                String str2 = this.c.j;
                Object[] objArr4 = {str2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d2a0069113c3657050f23d9ef7c832a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d2a0069113c3657050f23d9ef7c832a8");
                    return;
                }
                b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                c.b = A();
                c.c = str2;
                c.a(new b.a() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.c.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr5 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "195d9d751daaeae5d976119abc12af94", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "195d9d751daaeae5d976119abc12af94");
                            return;
                        }
                        c.this.e = bitmap;
                        c.this.a(bitmap);
                    }
                });
            }
        }
    }

    public final void a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29e0d27148919f535c8f92a8f2215f7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29e0d27148919f535c8f92a8f2215f7b");
        } else if (bitmap == null || bitmap.isRecycled()) {
        } else {
            this.f.setImageBitmap(bitmap);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.widgets.WatchedImageView.a
    public final void a(float[] fArr) {
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8030df09bdf56f613c1c7b00e29f885a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8030df09bdf56f613c1c7b00e29f885a");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = (int) fArr[4];
        layoutParams.height = (int) fArr[5];
        layoutParams.setMargins((int) fArr[0], (int) fArr[1], 0, 0);
        this.b.setLayoutParams(layoutParams);
        this.b.post(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.c.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd2c1b1316ee73baab5ecfbafb71c4bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd2c1b1316ee73baab5ecfbafb71c4bd");
                    return;
                }
                TagBoard tagBoard = c.this.b;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = TagBoard.g;
                if (PatchProxy.isSupport(objArr3, tagBoard, changeQuickRedirect3, false, "11a5b813013d9ebf993a978d6efb6d5b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, tagBoard, changeQuickRedirect3, false, "11a5b813013d9ebf993a978d6efb6d5b");
                } else {
                    tagBoard.removeAllViews();
                    tagBoard.h.clear();
                }
                TagBoard tagBoard2 = c.this.b;
                Context A = c.this.A();
                ArrayList<TagData> arrayList = c.this.c.b;
                Object[] objArr4 = {A, arrayList};
                ChangeQuickRedirect changeQuickRedirect4 = TagBoard.g;
                if (PatchProxy.isSupport(objArr4, tagBoard2, changeQuickRedirect4, false, "285bed8a94fbca004205ce3a08deb9ad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, tagBoard2, changeQuickRedirect4, false, "285bed8a94fbca004205ce3a08deb9ad");
                } else if (!com.sankuai.waimai.foundation.utils.b.b(arrayList)) {
                    for (TagData tagData : arrayList) {
                        tagBoard2.a(A, tagData);
                    }
                }
            }
        });
    }

    @Override // com.sankuai.waimai.ugc.creator.widgets.tag.TagBoard.a
    public final void a(ArrayList<TagData> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83d0b83fc159700cae60bea6f2443f79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83d0b83fc159700cae60bea6f2443f79");
            return;
        }
        this.c.b = arrayList;
        ((com.sankuai.waimai.ugc.creator.handler.d) a(com.sankuai.waimai.ugc.creator.handler.d.class)).a(this.c);
    }

    @Override // com.sankuai.waimai.ugc.creator.widgets.tag.TagBoard.a
    public final void a(float f, float f2, int i) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4b6a621295c37d0cb50857de4b09ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4b6a621295c37d0cb50857de4b09ac7");
            return;
        }
        g.a("b_waimai_xp9g2td9_mc", "c_waimai_n2dalt8s", B()).a();
        ((a) a(a.class)).e();
        b(f, f2, i);
    }

    public final void b(float f, float f2, int i) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26676db5d99c7bdc29944801c479f383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26676db5d99c7bdc29944801c479f383");
        } else if (!com.sankuai.waimai.foundation.utils.b.b(this.c.b) && this.c.b.size() >= 4) {
            b("最多可添加4个标签哦");
        } else {
            this.j = f;
            this.k = f2;
            this.l = i;
            ArrayList<com.sankuai.waimai.ugc.creator.entity.c> a2 = com.sankuai.waimai.ugc.creator.utils.c.a(this.g);
            Uri parse = Uri.parse(Uri.decode(this.h));
            Bundle bundle = new Bundle();
            bundle.putString("picList", new Gson().toJson(a2));
            bundle.putString("businessInfo", this.o.z);
            bundle.putInt("index", this.d);
            com.sankuai.waimai.foundation.router.a.a(B(), parse.toString(), bundle, 17);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.b
    public final boolean a(int i, int i2, Intent intent) {
        String a2;
        TagData tagData;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e1d24a130456bfabc4be731994e4c10", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e1d24a130456bfabc4be731994e4c10")).booleanValue();
        }
        if (i == 17) {
            if (i2 == -1 && (a2 = f.a(intent, "resultData")) != null && (tagData = (TagData) new Gson().fromJson(a2, (Class<Object>) TagData.class)) != null) {
                tagData.f = this.j;
                tagData.g = this.k;
                tagData.c = this.l;
                if (this.c.b == null) {
                    this.c.b = new ArrayList<>();
                    this.c.b.add(tagData);
                }
                this.b.a(A(), tagData);
            }
            this.j = 0.5f;
            this.k = 0.5f;
            this.l = 1;
            return true;
        }
        return false;
    }

    @Override // com.sankuai.waimai.ugc.creator.base.b
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d620c203457eec6192b8b69999e1836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d620c203457eec6192b8b69999e1836");
            return;
        }
        Bundle arguments = this.v.getArguments();
        this.d = arguments.getInt("media_position");
        this.g = arguments.getParcelableArrayList("input_media_data");
        this.c = this.g.get(this.d);
        com.sankuai.waimai.ugc.creator.entity.a a2 = this.o.a();
        if (a2 != null) {
            this.h = a2.e;
            this.i = true;
        }
    }
}
