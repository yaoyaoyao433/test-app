package com.sankuai.waimai.ugc.creator.ability.videocover;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.ability.videocover.c;
import com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock;
import com.sankuai.waimai.ugc.creator.entity.d;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.manager.e;
import com.sankuai.waimai.ugc.creator.utils.j;
import com.sankuai.waimai.ugc.creator.widgets.imageview.CropImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.ugc.creator.base.a {
    public static ChangeQuickRedirect a;
    private c A;
    private int B;
    private String C;
    private long D;
    private e E;
    CropImageView b;
    Bitmap c;
    long d;
    private FlowLineActionBarBlock z;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81ff22b0980365edfd9d8cb7aa234317", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81ff22b0980365edfd9d8cb7aa234317");
            return;
        }
        this.B = 100;
        this.E = new e() { // from class: com.sankuai.waimai.ugc.creator.ability.videocover.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.manager.e
            public final void a(int i, long j, Bitmap bitmap) {
                float f;
                Object[] objArr2 = {Integer.valueOf(i), new Long(j), bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83a146a2dea291454a0a29327e345745", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83a146a2dea291454a0a29327e345745");
                    return;
                }
                a.this.b.setImageBitmap(bitmap);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Object[] objArr3 = {Integer.valueOf(width), Integer.valueOf(height)};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "eacda047074d15a15fc4ffa81f02b08b", RobustBitConfig.DEFAULT_VALUE)) {
                    f = ((Float) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "eacda047074d15a15fc4ffa81f02b08b")).floatValue();
                } else {
                    float f2 = width / height;
                    f = f2 <= 0.875f ? 0.75f : (f2 <= 0.875f || f2 > 1.1666666f) ? 1.3333334f : 1.0f;
                }
                a.this.b.setCropBoundsRatio(f);
                if (a.this.c != null) {
                    a.this.c.recycle();
                }
                a.this.c = bitmap;
                a.this.d = j;
            }
        };
    }

    public static /* synthetic */ void a(a aVar, d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "59e46257d8749ffba8e1122e4b3c1739", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "59e46257d8749ffba8e1122e4b3c1739");
            return;
        }
        dVar.g = aVar.d;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar);
        aVar.a((List<com.sankuai.waimai.ugc.creator.entity.c>) arrayList, 3);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc9f299e202f92e5aac51f1f4c78bc1", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc9f299e202f92e5aac51f1f4c78bc1") : layoutInflater.inflate(R.layout.wm_ugc_video_cover_select_ability_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final String[] c() {
        return this.k;
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void bK_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a843b06df9d44602e675cf7f0033270d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a843b06df9d44602e675cf7f0033270d");
            return;
        }
        this.z = new FlowLineActionBarBlock(0);
        a(R.id.cover_actionbar_container, (int) this.z);
        FlowLineActionBarBlock flowLineActionBarBlock = this.z;
        Object[] objArr2 = {Integer.valueOf((int) R.string.wm_ugc_media_picker_yes)};
        ChangeQuickRedirect changeQuickRedirect2 = FlowLineActionBarBlock.a;
        if (PatchProxy.isSupport(objArr2, flowLineActionBarBlock, changeQuickRedirect2, false, "93424670d27d57c836c3f6e2c117e11a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, flowLineActionBarBlock, changeQuickRedirect2, false, "93424670d27d57c836c3f6e2c117e11a");
        } else if (flowLineActionBarBlock.b == 0) {
            flowLineActionBarBlock.c.setText(R.string.wm_ugc_media_picker_yes);
            flowLineActionBarBlock.c.setVisibility(0);
        }
        this.z.a(R.string.wm_ugc_video_cover_select_title);
        this.z.j = new FlowLineActionBarBlock.a() { // from class: com.sankuai.waimai.ugc.creator.ability.videocover.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7df39f67850f644792a60cb3600277e0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7df39f67850f644792a60cb3600277e0");
                    return;
                }
                com.sankuai.waimai.ugc.creator.judas.e a2 = com.sankuai.waimai.ugc.creator.judas.e.a();
                Activity B = a.this.B();
                Object[] objArr4 = {B};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.ugc.creator.judas.e.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "59525913f2419efde66461afd0b824ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "59525913f2419efde66461afd0b824ee");
                } else if (a2.b != null) {
                    a2.a(a2.b.w, a2.b.i, (Map<String, Object>) null, B);
                }
                a.this.B().onBackPressed();
            }

            @Override // com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock.a
            public final void b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6bacce1396b546686f30db26f6ff1a40", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6bacce1396b546686f30db26f6ff1a40");
                    return;
                }
                com.sankuai.waimai.ugc.creator.judas.e a2 = com.sankuai.waimai.ugc.creator.judas.e.a();
                Activity B = a.this.B();
                Object[] objArr4 = {B};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.ugc.creator.judas.e.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "9e14a2933f8a29e3027d0205a2a62876", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "9e14a2933f8a29e3027d0205a2a62876");
                } else if (a2.b != null) {
                    a2.a(a2.b.v, a2.b.i, (Map<String, Object>) null, B);
                }
                a.this.x();
            }
        };
        this.b = (CropImageView) b(R.id.cover_image_preview);
        CropImageView cropImageView = this.b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = CropImageView.a;
        if (PatchProxy.isSupport(objArr3, cropImageView, changeQuickRedirect3, false, "24e9d596ba74ac9814857f01b7062662", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cropImageView, changeQuickRedirect3, false, "24e9d596ba74ac9814857f01b7062662");
        } else {
            com.sankuai.waimai.ugc.creator.widgets.imageview.a aVar = cropImageView.b;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.ugc.creator.widgets.imageview.a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "b171d481093baf78e0a98a3eca81b1fb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "b171d481093baf78e0a98a3eca81b1fb");
            } else {
                aVar.r = false;
                aVar.b.invalidate();
            }
        }
        CropImageView cropImageView2 = this.b;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = CropImageView.a;
        if (PatchProxy.isSupport(objArr5, cropImageView2, changeQuickRedirect5, false, "f1c09dc63533fdde83da2bf0349c2238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, cropImageView2, changeQuickRedirect5, false, "f1c09dc63533fdde83da2bf0349c2238");
        } else {
            cropImageView2.b.s = false;
        }
        Intent intent = B().getIntent();
        this.C = j.a(intent, "video_uri", "");
        this.D = j.a(intent, "select_time", 0);
        this.B = j.a(intent, "compressQuality", 100);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ff17ab8a7c83d70a8caf763037fef36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ff17ab8a7c83d70a8caf763037fef36");
            return;
        }
        c.a aVar = new c.a();
        aVar.a = this.E;
        aVar.b = this.D;
        aVar.c = this.C;
        this.A = new c(aVar);
        a(R.id.cover_select_container, (int) this.A);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d91f61417086beddcacb238e3eb90dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d91f61417086beddcacb238e3eb90dc");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44f4b90d1786830b4578f502b7558668", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44f4b90d1786830b4578f502b7558668");
        } else {
            this.b.a(new com.sankuai.waimai.ugc.creator.widgets.imageview.c() { // from class: com.sankuai.waimai.ugc.creator.ability.videocover.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.widgets.imageview.c
                public final void a(ImageData imageData) {
                    Object[] objArr3 = {imageData};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca03b7c7c2dfc925c6c2cceeae72a817", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca03b7c7c2dfc925c6c2cceeae72a817");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(imageData);
                    if (a.this.o.A == 1001) {
                        final a aVar = a.this;
                        Object[] objArr4 = {arrayList};
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "39793d41339f727b3292dc2032a9d2f8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "39793d41339f727b3292dc2032a9d2f8");
                            return;
                        }
                        aVar.u();
                        com.sankuai.waimai.ugc.creator.utils.task.b.a((com.sankuai.waimai.ugc.creator.utils.task.a) new com.sankuai.waimai.ugc.creator.task.a(arrayList) { // from class: com.sankuai.waimai.ugc.creator.ability.videocover.a.4
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.ugc.creator.utils.task.a
                            public final /* synthetic */ void a(ArrayList<com.sankuai.waimai.ugc.creator.entity.c> arrayList2) {
                                ArrayList<com.sankuai.waimai.ugc.creator.entity.c> arrayList3 = arrayList2;
                                Object[] objArr5 = {arrayList3};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c2d763345df60f98bf3eae8ff32b0ea4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c2d763345df60f98bf3eae8ff32b0ea4");
                                    return;
                                }
                                a.this.v();
                                com.sankuai.waimai.ugc.creator.entity.c cVar = arrayList3.get(0);
                                if (cVar instanceof d) {
                                    a.a(a.this, (d) cVar);
                                }
                            }
                        });
                        return;
                    }
                    a.a(a.this, imageData.a());
                }
            });
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eef66eb29d8d4eb277e2c7827b8375f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eef66eb29d8d4eb277e2c7827b8375f");
        } else {
            r();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e02ddacb5e699b3b3fe5239d2ad0354", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e02ddacb5e699b3b3fe5239d2ad0354");
            return;
        }
        super.a();
        com.sankuai.waimai.ugc.creator.judas.e a2 = com.sankuai.waimai.ugc.creator.judas.e.a();
        Activity B = B();
        Object[] objArr2 = {B};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ugc.creator.judas.e.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "e8edd4f98b477b46ba9d6f4ad24d9f33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "e8edd4f98b477b46ba9d6f4ad24d9f33");
        } else if (a2.b != null) {
            a2.a(B, a2.b.i, null);
        }
    }
}
