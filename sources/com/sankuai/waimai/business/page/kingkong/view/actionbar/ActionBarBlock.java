package com.sankuai.waimai.business.page.kingkong.view.actionbar;

import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.graphics.Bitmap;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cube.pga.action.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.page.common.model.ChannelImages;
import com.sankuai.waimai.business.page.common.model.ChannelInfo;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.common.net.response.ChannelBannerInfoResponseV8;
import com.sankuai.waimai.business.page.home.head.recommendwords.alita.RefreshResponseData;
import com.sankuai.waimai.business.page.kingkong.KingKongActivity;
import com.sankuai.waimai.business.page.kingkong.viewmodel.KingKongViewModel;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ActionBarBlock extends com.meituan.android.cube.pga.block.a<a, c, com.sankuai.waimai.business.page.kingkong.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0437f1db0874a9614e2854f7ea26adc", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0437f1db0874a9614e2854f7ea26adc") : new c(null);
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "273bc1241252c1442d8310409158db35", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "273bc1241252c1442d8310409158db35") : new a(l(), this.h);
    }

    @Keep
    public ActionBarBlock(com.sankuai.waimai.business.page.kingkong.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "977cfbd4dbc56973ab3640e1eb3fac20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "977cfbd4dbc56973ab3640e1eb3fac20");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b174345ac1c1c4e7ddb7aa15efb33f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b174345ac1c1c4e7ddb7aa15efb33f7");
            return;
        }
        ((KingKongViewModel) q.a(((com.sankuai.waimai.business.page.kingkong.a) F()).b()).a(KingKongViewModel.class)).b.a((KingKongActivity) ((com.sankuai.waimai.business.page.kingkong.a) F()).b(), new l<com.sankuai.waimai.business.page.kingkong.net.b>() { // from class: com.sankuai.waimai.business.page.kingkong.view.actionbar.ActionBarBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.business.page.kingkong.net.b bVar) {
                com.sankuai.waimai.business.page.kingkong.net.b bVar2 = bVar;
                Object[] objArr3 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f1d7ceb0ae7a68f0f12ca1f3f445815e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f1d7ceb0ae7a68f0f12ca1f3f445815e");
                } else if (bVar2 == null || bVar2.a == null) {
                } else {
                    ActionBarBlock.this.n = new c(bVar2.a.data);
                    ActionBarBlock.this.I();
                }
            }
        });
        ((com.sankuai.waimai.business.page.kingkong.a) F()).P.a(new com.meituan.android.cube.pga.action.b<RocksServerModel>() { // from class: com.sankuai.waimai.business.page.kingkong.view.actionbar.ActionBarBlock.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(RocksServerModel rocksServerModel) {
                RefreshResponseData refreshResponseData;
                RocksServerModel rocksServerModel2 = rocksServerModel;
                Object[] objArr3 = {rocksServerModel2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9acaf789cf7750bbad2897733c63503f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9acaf789cf7750bbad2897733c63503f");
                    return;
                }
                ChannelImages channelImages = null;
                if (rocksServerModel2 != null) {
                    try {
                        JsonObject jsonObject = (JsonObject) new JsonParser().parse(rocksServerModel2.stringData);
                        String str = "";
                        if (jsonObject != null && jsonObject.get("channel_images") != null) {
                            str = jsonObject.get("channel_images").getAsString();
                        }
                        String str2 = "";
                        if (jsonObject != null && jsonObject.get("channel_search_words") != null) {
                            str2 = jsonObject.get("channel_search_words").getAsString();
                        }
                        channelImages = (ChannelImages) new Gson().fromJson(str, new TypeToken<ChannelImages>() { // from class: com.sankuai.waimai.business.page.kingkong.view.actionbar.ActionBarBlock.2.1
                        }.getType());
                        refreshResponseData = (RefreshResponseData) new Gson().fromJson(str2, new TypeToken<RefreshResponseData>() { // from class: com.sankuai.waimai.business.page.kingkong.view.actionbar.ActionBarBlock.2.2
                        }.getType());
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    refreshResponseData = null;
                }
                ActionBarBlock.this.n = new c(new ChannelBannerInfoResponseV8(channelImages, refreshResponseData));
                ActionBarBlock.this.I();
            }
        });
        ((com.sankuai.waimai.business.page.kingkong.a) F()).K.b = new d() { // from class: com.sankuai.waimai.business.page.kingkong.view.actionbar.ActionBarBlock.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                int width;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "639bf1cb8a972fa39ba99fb8bdb9b9b0", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "639bf1cb8a972fa39ba99fb8bdb9b9b0");
                }
                a aVar2 = (a) ActionBarBlock.this.g;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a.d;
                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "d0be6812966196e05c67d4f0eebc19f3", RobustBitConfig.DEFAULT_VALUE)) {
                    width = ((Integer) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "d0be6812966196e05c67d4f0eebc19f3")).intValue();
                } else {
                    b bVar = aVar2.e;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = b.a;
                    if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "9ec3743ed6a1a664db5e2140903f70be", RobustBitConfig.DEFAULT_VALUE)) {
                        width = ((Integer) PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "9ec3743ed6a1a664db5e2140903f70be")).intValue();
                    } else {
                        int[] iArr = new int[2];
                        bVar.h.getLocationOnScreen(iArr);
                        int i = iArr[0];
                        if (i > bVar.m) {
                            i -= bVar.m;
                        }
                        width = i + bVar.h.getWidth();
                    }
                }
                return Integer.valueOf(width);
            }
        };
        ((com.sankuai.waimai.business.page.kingkong.a) F()).L.b = new d() { // from class: com.sankuai.waimai.business.page.kingkong.view.actionbar.ActionBarBlock.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "67227f20765b3f6b9908d92bd2136f63", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "67227f20765b3f6b9908d92bd2136f63");
                }
                return Integer.valueOf(((a) ActionBarBlock.this.g).e != null ? b.b : 0);
            }
        };
        ((com.sankuai.waimai.business.page.kingkong.a) F()).N.a(new com.meituan.android.cube.pga.action.b<List<RecommendedSearchKeyword>>() { // from class: com.sankuai.waimai.business.page.kingkong.view.actionbar.ActionBarBlock.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(List<RecommendedSearchKeyword> list) {
                List<RecommendedSearchKeyword> list2 = list;
                Object[] objArr3 = {list2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ead0bd1714302810bdd35af29de54e17", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ead0bd1714302810bdd35af29de54e17");
                    return;
                }
                a aVar2 = (a) ActionBarBlock.this.g;
                Object[] objArr4 = {list2};
                ChangeQuickRedirect changeQuickRedirect4 = a.d;
                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "c2805e00366f68e7a5088eee3fadd74e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "c2805e00366f68e7a5088eee3fadd74e");
                } else {
                    aVar2.e.a(list2);
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "120c99d14fa689bb3e8c109d2e55f46a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "120c99d14fa689bb3e8c109d2e55f46a");
        } else {
            super.s();
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        long j;
        final String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a9343d76c8060fc4f8bebb617eb4ed6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a9343d76c8060fc4f8bebb617eb4ed6");
            return;
        }
        super.I();
        a aVar = (a) this.g;
        ChannelBannerInfoResponseV8 e = ((c) this.n).e();
        Object[] objArr2 = {e};
        ChangeQuickRedirect changeQuickRedirect2 = a.d;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9bf5fd62d04e8cf2f4c432ce3feeb45d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9bf5fd62d04e8cf2f4c432ce3feeb45d");
            return;
        }
        final b bVar = aVar.e;
        Object[] objArr3 = {e};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "8a28a8301f50b6603a4cfc9e17eadc50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "8a28a8301f50b6603a4cfc9e17eadc50");
            return;
        }
        KingkongInfo a = bVar.k.d.a();
        if (a != null) {
            str = a.c;
            j = a.b;
            if (a.r == 1) {
                bVar.l.setVisibility(0);
            } else {
                bVar.l.setVisibility(8);
            }
        } else {
            j = 0;
            str = null;
        }
        ChannelInfo channelInfo = (e == null || e.channelImages == null) ? null : e.channelImages.channelInfo;
        if (channelInfo == null) {
            bVar.a(str);
            bVar.d.setImageBitmap(null);
            bVar.d.setBackgroundColor(ActivityCompat.getColor(bVar.j.bB_(), R.color.wm_common_white));
            bVar.f.setTextColor(-16777216);
            bVar.i.setVisibility(8);
            bVar.e.setPadding(bVar.e.getPaddingLeft(), bVar.e.getPaddingTop(), bVar.e.getPaddingLeft(), bVar.e.getPaddingBottom());
            return;
        }
        final Boolean a2 = bVar.k.i.a();
        final boolean z = j == 910;
        if (z && (a2 == null || !a2.booleanValue())) {
            bVar.f.setVisibility(8);
            bVar.g.setVisibility(0);
            bVar.g.setImageResource(R.drawable.wm_page_kingkong_meishi_title);
            bVar.d.setVisibility(0);
            bVar.d.setBackgroundColor(0);
            bVar.d.setBackground(bVar.j.getResources().getDrawable(R.drawable.wm_page_kingkong_actionbar_bg));
            bVar.c.setBackground(bVar.j.getResources().getDrawable(R.drawable.wm_page_kingkong_actionbar_bg));
            bVar.h.setTextColor(bVar.j.getResources().getColor(R.color.roo_default_color_background));
            bVar.a(true);
        } else {
            bVar.c.setBackgroundColor(-1);
            if (bVar.c.getBackground() != null) {
                bVar.c.getBackground().mutate().setAlpha(0);
            }
            if (!TextUtils.isEmpty(channelInfo.namePicUrl)) {
                b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                c.c = channelInfo.namePicUrl;
                c.a(new b.a() { // from class: com.sankuai.waimai.business.page.kingkong.view.actionbar.b.6
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr4 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "083f3af9d5fd08b56f7a9dbab36d12c1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "083f3af9d5fd08b56f7a9dbab36d12c1");
                            return;
                        }
                        int height = bVar.g.getHeight();
                        ViewGroup.LayoutParams layoutParams = bVar.g.getLayoutParams();
                        layoutParams.width = (int) (((bitmap.getWidth() / bitmap.getHeight()) * height) + 0.5f);
                        bVar.g.setLayoutParams(layoutParams);
                        bVar.g.setVisibility(0);
                        bVar.g.setImageBitmap(bitmap);
                        bVar.f.setVisibility(8);
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "34f70aba176f425bcf32bcc3b3cf4acd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "34f70aba176f425bcf32bcc3b3cf4acd");
                        } else {
                            bVar.a(str);
                        }
                    }
                });
            } else {
                bVar.a(str);
            }
            if (!TextUtils.isEmpty(channelInfo.bgPicUrl)) {
                bVar.d.setVisibility(0);
                bVar.d.setBackgroundColor(ActivityCompat.getColor(bVar.j.bB_(), R.color.wm_page_kingkong_atmosphere_default_color));
                b.C0608b c2 = com.sankuai.meituan.mtimageloader.loader.a.c();
                c2.c = channelInfo.bgPicUrl;
                c2.a(new b.a() { // from class: com.sankuai.waimai.business.page.kingkong.view.actionbar.b.7
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr4 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1f743eb948876a1fda72a180df3dc5c7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1f743eb948876a1fda72a180df3dc5c7");
                            return;
                        }
                        bVar.d.setImageBitmap(bitmap);
                        bVar.f.setTextColor(-1);
                        bVar.h.setTextColor(bVar.j.getResources().getColor(R.color.roo_default_color_background));
                        bVar.a(true);
                        b.b(bVar, true);
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a91186f62f97dc2f87d26f950430e09c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a91186f62f97dc2f87d26f950430e09c");
                            return;
                        }
                        bVar.d.setVisibility(0);
                        if (!z || a2 == null || !a2.booleanValue()) {
                            bVar.d.setImageResource(R.drawable.wm_page_kingkong_actionbar_bg_default);
                            bVar.a(false);
                        } else {
                            bVar.d.setImageResource(R.drawable.wm_page_kingkong_actionbar_bg);
                            bVar.h.setTextColor(bVar.j.getResources().getColor(R.color.roo_default_color_background));
                            bVar.a(true);
                            b.b(bVar, true);
                        }
                        bVar.f.setTextColor(-16777216);
                    }
                });
            } else {
                if (z && a2 != null && a2.booleanValue()) {
                    bVar.h.setTextColor(bVar.j.getResources().getColor(R.color.roo_default_color_background));
                    bVar.a(true);
                    bVar.n = true;
                }
                bVar.d.setVisibility(0);
                if (z && a2 != null && a2.booleanValue()) {
                    bVar.d.setImageResource(R.drawable.wm_page_kingkong_actionbar_bg);
                } else {
                    bVar.d.setImageResource(R.drawable.wm_page_kingkong_actionbar_bg_default);
                    bVar.a(false);
                }
                bVar.f.setTextColor(-16777216);
            }
        }
        if (e != null && e.isNewBarStyle()) {
            bVar.e.setPadding(bVar.e.getPaddingLeft(), bVar.e.getPaddingTop(), 0, bVar.e.getPaddingBottom());
            bVar.i.setVisibility(0);
            bVar.b(true);
            return;
        }
        bVar.e.setPadding(bVar.e.getPaddingLeft(), bVar.e.getPaddingTop(), bVar.e.getPaddingLeft(), bVar.e.getPaddingBottom());
        bVar.i.setVisibility(8);
        bVar.b(false);
    }
}
