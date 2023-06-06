package com.sankuai.waimai.platform.widget.weather;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.widget.weather.f;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WeatherView extends View {
    public static ChangeQuickRedirect a;
    boolean b;
    private final String c;
    private f d;
    private Context e;
    private f.a f;
    private int g;
    private int h;

    public WeatherView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7f586a54cd400a675c90a9bfe9dde32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7f586a54cd400a675c90a9bfe9dde32");
            return;
        }
        this.c = getClass().getSimpleName();
        this.e = context;
    }

    public WeatherView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6e3dab744cf275b18bf12a3b2e2e8c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6e3dab744cf275b18bf12a3b2e2e8c7");
            return;
        }
        this.c = getClass().getSimpleName();
        this.e = context;
    }

    public WeatherView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30b5129d63ae4bdf40733d063ca27ccd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30b5129d63ae4bdf40733d063ca27ccd");
            return;
        }
        this.c = getClass().getSimpleName();
        this.e = context;
    }

    public WeatherView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37d756823a65d009d8f8f0899d005046", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37d756823a65d009d8f8f0899d005046");
            return;
        }
        this.c = getClass().getSimpleName();
        this.e = context;
    }

    private void setDrawer(f fVar) {
        if (fVar == null) {
            return;
        }
        this.d = fVar;
    }

    public void setDrawerType(f.a aVar) {
        f dVar;
        c[] cVarArr;
        c[] cVarArr2;
        c[] cVarArr3;
        c[] cVarArr4;
        c[] cVarArr5;
        c[] cVarArr6;
        c[] cVarArr7;
        c[] cVarArr8;
        Context context;
        c[] cVarArr9;
        Context context2;
        c[] cVarArr10;
        Context context3;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bd3dbea743c13b96dcfa044c5c65ff4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bd3dbea743c13b96dcfa044c5c65ff4");
        } else if (aVar == null || aVar == this.f) {
        } else {
            this.f = aVar;
            f.a aVar2 = this.f;
            Object[] objArr2 = {aVar2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22769b57d89d3e275447804fa18b0808", RobustBitConfig.DEFAULT_VALUE)) {
                switch (aVar2) {
                    case RAIN_MEDIUM:
                        Context context4 = this.e;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = c.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "34a81e85ce44a1602bdf3c060b2dad03", RobustBitConfig.DEFAULT_VALUE)) {
                            cVarArr = (c[]) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "34a81e85ce44a1602bdf3c060b2dad03");
                        } else {
                            ArrayList arrayList = new ArrayList();
                            c cVar = new c();
                            arrayList.add(cVar);
                            cVar.f = 300;
                            cVar.n = 200.0d;
                            cVar.o = 180.0d;
                            cVar.p = 200.0d;
                            cVar.q = 300.0d;
                            cVar.r = 0.3d;
                            cVar.s = 0.0d;
                            cVar.g = 3.0d;
                            cVar.h = 1.5d;
                            cVar.i = 90.0d;
                            cVar.j = 0.0d;
                            cVar.v = 0.0d;
                            cVar.b = 1.5d;
                            cVar.c = 0.5d;
                            cVar.k = 200.0d;
                            cVar.m = 0.0d;
                            cVar.B = true;
                            cVar.z = com.meituan.roodesign.resfetcher.runtime.c.a(com.meituan.android.singleton.b.a, "waimai_c_wm_order_weather_heavy_rain1");
                            cVarArr = (c[]) arrayList.toArray(new c[0]);
                        }
                        dVar = new d(context4, cVarArr);
                        break;
                    case RAIN_LARGE:
                        Context context5 = this.e;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = c.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "fe46b7fc26291b4305215c9064abca70", RobustBitConfig.DEFAULT_VALUE)) {
                            cVarArr2 = (c[]) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "fe46b7fc26291b4305215c9064abca70");
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            c cVar2 = new c();
                            arrayList2.add(cVar2);
                            cVar2.f = 800;
                            cVar2.n = 200.0d;
                            cVar2.o = 180.0d;
                            cVar2.p = 200.0d;
                            cVar2.q = 300.0d;
                            cVar2.r = 0.25d;
                            cVar2.s = 0.1d;
                            cVar2.g = 2.0d;
                            cVar2.h = 1.5d;
                            cVar2.i = 75.0d;
                            cVar2.j = 0.0d;
                            cVar2.v = -13.0d;
                            cVar2.b = 1.7999999523162842d;
                            cVar2.c = 0.5d;
                            cVar2.k = 500.0d;
                            cVar2.m = 0.0d;
                            cVar2.B = true;
                            cVar2.z = com.meituan.roodesign.resfetcher.runtime.c.a(com.meituan.android.singleton.b.a, "waimai_c_wm_order_weather_heavy_rain1");
                            c cVar3 = new c();
                            arrayList2.add(cVar3);
                            cVar3.f = 1000;
                            cVar3.n = 200.0d;
                            cVar3.o = 180.0d;
                            cVar3.p = 200.0d;
                            cVar3.q = 300.0d;
                            cVar3.r = 0.25d;
                            cVar3.s = 0.1d;
                            cVar3.g = 2.0d;
                            cVar3.h = 1.5d;
                            cVar3.i = 75.0d;
                            cVar3.j = 0.0d;
                            cVar3.v = -13.0d;
                            cVar3.b = 1.7999999523162842d;
                            cVar3.c = 0.5d;
                            cVar3.k = 500.0d;
                            cVar3.m = 0.0d;
                            cVar3.B = true;
                            cVar3.z = com.meituan.roodesign.resfetcher.runtime.c.a(com.meituan.android.singleton.b.a, "waimai_c_wm_order_weather_heavy_rain2");
                            cVarArr2 = (c[]) arrayList2.toArray(new c[0]);
                        }
                        dVar = new d(context5, cVarArr2);
                        break;
                    case RAIN_STORM:
                        Context context6 = this.e;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = c.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "b0da485d6b0d8e109c91516b3948e653", RobustBitConfig.DEFAULT_VALUE)) {
                            cVarArr3 = (c[]) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "b0da485d6b0d8e109c91516b3948e653");
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            c cVar4 = new c();
                            arrayList3.add(cVar4);
                            cVar4.f = 800;
                            cVar4.n = 200.0d;
                            cVar4.o = 200.0d;
                            cVar4.p = 200.0d;
                            cVar4.q = 300.0d;
                            cVar4.r = 0.2d;
                            cVar4.s = 0.1d;
                            cVar4.g = 2.0d;
                            cVar4.h = 1.5d;
                            cVar4.i = 65.0d;
                            cVar4.j = 0.0d;
                            cVar4.v = -25.0d;
                            cVar4.b = 1.7999999523162842d;
                            cVar4.c = 0.5d;
                            cVar4.k = 600.0d;
                            cVar4.m = 0.0d;
                            cVar4.B = false;
                            cVar4.z = com.meituan.roodesign.resfetcher.runtime.c.a(com.meituan.android.singleton.b.a, "waimai_c_wm_order_weather_storm_rain1");
                            c cVar5 = new c();
                            arrayList3.add(cVar5);
                            cVar5.f = 800;
                            cVar5.n = 200.0d;
                            cVar5.o = 200.0d;
                            cVar5.p = 200.0d;
                            cVar5.q = 300.0d;
                            cVar5.r = 0.2d;
                            cVar5.s = 0.1d;
                            cVar5.g = 2.0d;
                            cVar5.h = 1.5d;
                            cVar5.i = 65.0d;
                            cVar5.j = 0.0d;
                            cVar5.v = -25.0d;
                            cVar5.b = 1.7999999523162842d;
                            cVar5.c = 0.5d;
                            cVar5.k = 600.0d;
                            cVar5.m = 0.0d;
                            cVar5.B = false;
                            cVar5.z = com.meituan.roodesign.resfetcher.runtime.c.a(com.meituan.android.singleton.b.a, "waimai_c_wm_order_weather_storm_rain2");
                            cVarArr3 = (c[]) arrayList3.toArray(new c[0]);
                        }
                        dVar = new d(context6, cVarArr3);
                        break;
                    case SNOW_LARGE:
                        Context context7 = this.e;
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = c.a;
                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "480421a0aa4053e091e9d99c7255a559", RobustBitConfig.DEFAULT_VALUE)) {
                            cVarArr4 = (c[]) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "480421a0aa4053e091e9d99c7255a559");
                        } else {
                            Context context8 = com.meituan.android.singleton.b.a;
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(new c());
                            c cVar6 = new c();
                            arrayList4.add(cVar6);
                            cVar6.f = 100;
                            cVar6.n = 93.0d;
                            cVar6.o = 281.0d;
                            cVar6.p = -167.0d;
                            cVar6.q = 167.0d;
                            cVar6.r = 0.7d;
                            cVar6.s = 0.0d;
                            cVar6.t = 0.3d;
                            cVar6.u = 0.1d;
                            cVar6.g = 16.0d;
                            cVar6.h = 6.0d;
                            cVar6.i = 70.0d;
                            cVar6.j = 5.0d;
                            cVar6.k = 30.0d;
                            cVar6.l = 0.2d;
                            cVar6.m = 0.0d;
                            cVar6.z = com.meituan.roodesign.resfetcher.runtime.c.a(context8, "waimai_c_weather_snow_heavy_1");
                            c cVar7 = new c();
                            arrayList4.add(cVar7);
                            cVar7.f = 400;
                            cVar7.n = 93.0d;
                            cVar7.o = 281.0d;
                            cVar7.p = -167.0d;
                            cVar7.q = 167.0d;
                            cVar7.r = 0.9d;
                            cVar7.s = 0.0d;
                            cVar7.t = 0.7d;
                            cVar7.u = 0.0d;
                            cVar7.g = 18.0d;
                            cVar7.h = 8.0d;
                            cVar7.i = 70.0d;
                            cVar7.j = 5.0d;
                            cVar7.k = 35.0d;
                            cVar7.l = 0.2d;
                            cVar7.m = 0.0d;
                            cVar7.z = com.meituan.roodesign.resfetcher.runtime.c.a(context8, "waimai_c_weather_snow_heavy_2");
                            c cVar8 = new c();
                            arrayList4.add(cVar8);
                            cVar8.f = 100;
                            cVar8.n = 93.0d;
                            cVar8.o = 281.0d;
                            cVar8.p = -167.0d;
                            cVar8.q = 167.0d;
                            cVar8.r = 0.9d;
                            cVar8.s = 0.0d;
                            cVar8.t = 0.8d;
                            cVar8.u = 0.0d;
                            cVar8.g = 32.0d;
                            cVar8.h = 10.0d;
                            cVar8.i = 70.0d;
                            cVar8.j = 5.0d;
                            cVar8.k = 35.0d;
                            cVar8.l = 0.2d;
                            cVar8.m = 0.0d;
                            cVar8.z = com.meituan.roodesign.resfetcher.runtime.c.a(context8, "waimai_c_weather_snow_heavy_3");
                            cVarArr4 = (c[]) arrayList4.toArray(new c[0]);
                        }
                        dVar = new d(context7, cVarArr4);
                        break;
                    case SNOW_MEDIUM:
                        Context context9 = this.e;
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = c.a;
                        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "e4aae860abf9354ee183c6c1792143e5", RobustBitConfig.DEFAULT_VALUE)) {
                            cVarArr5 = (c[]) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "e4aae860abf9354ee183c6c1792143e5");
                        } else {
                            Context context10 = com.meituan.android.singleton.b.a;
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(new c());
                            c cVar9 = new c();
                            arrayList5.add(cVar9);
                            cVar9.f = MapConstant.ANIMATION_DURATION_SHORT;
                            cVar9.n = 93.0d;
                            cVar9.o = 281.0d;
                            cVar9.p = -167.0d;
                            cVar9.q = 167.0d;
                            cVar9.r = 0.8d;
                            cVar9.s = 0.0d;
                            cVar9.t = 0.4d;
                            cVar9.u = 0.1d;
                            cVar9.g = 7.0d;
                            cVar9.h = 2.0d;
                            cVar9.i = 90.0d;
                            cVar9.j = 5.0d;
                            cVar9.k = 50.0d;
                            cVar9.l = 0.2d;
                            cVar9.m = 0.0d;
                            cVar9.z = com.meituan.roodesign.resfetcher.runtime.c.a(context10, "waimai_c_weather_snow_moderate_1");
                            c cVar10 = new c();
                            arrayList5.add(cVar10);
                            cVar10.f = 100;
                            cVar10.n = 93.0d;
                            cVar10.o = 281.0d;
                            cVar10.p = -167.0d;
                            cVar10.q = 167.0d;
                            cVar10.r = 0.8d;
                            cVar10.s = 0.0d;
                            cVar10.t = 0.6d;
                            cVar10.u = 0.0d;
                            cVar10.g = 12.0d;
                            cVar10.h = 2.0d;
                            cVar10.i = 90.0d;
                            cVar10.j = 5.0d;
                            cVar10.k = 60.0d;
                            cVar10.l = 0.2d;
                            cVar10.m = 0.0d;
                            cVar10.z = com.meituan.roodesign.resfetcher.runtime.c.a(context10, "waimai_c_weather_snow_moderate_2");
                            c cVar11 = new c();
                            arrayList5.add(cVar11);
                            cVar11.f = MapConstant.ANIMATION_DURATION_SHORT;
                            cVar11.n = 93.0d;
                            cVar11.o = 281.0d;
                            cVar11.p = -167.0d;
                            cVar11.q = 167.0d;
                            cVar11.r = 0.8d;
                            cVar11.s = 0.0d;
                            cVar11.t = 0.7d;
                            cVar11.u = 0.0d;
                            cVar11.g = 16.0d;
                            cVar11.h = 2.0d;
                            cVar11.i = 90.0d;
                            cVar11.j = 5.0d;
                            cVar11.k = 30.0d;
                            cVar11.l = 0.2d;
                            cVar11.m = 0.0d;
                            cVar11.z = com.meituan.roodesign.resfetcher.runtime.c.a(context10, "waimai_c_weather_snow_moderate_3");
                            cVarArr5 = (c[]) arrayList5.toArray(new c[0]);
                        }
                        dVar = new d(context9, cVarArr5);
                        break;
                    case SNOW_BLIZZARD:
                        Context context11 = this.e;
                        Object[] objArr8 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect8 = c.a;
                        if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "ec24a32ad60cba3fbb6e333eb25e060f", RobustBitConfig.DEFAULT_VALUE)) {
                            cVarArr6 = (c[]) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "ec24a32ad60cba3fbb6e333eb25e060f");
                        } else {
                            Context context12 = com.meituan.android.singleton.b.a;
                            ArrayList arrayList6 = new ArrayList();
                            c cVar12 = new c();
                            arrayList6.add(cVar12);
                            cVar12.f = 380;
                            cVar12.b = 1.2000000476837158d;
                            cVar12.c = 0.30000001192092896d;
                            cVar12.n = 93.0d;
                            cVar12.o = 411.0d;
                            cVar12.p = -167.0d;
                            cVar12.q = 167.0d;
                            cVar12.r = 0.8d;
                            cVar12.s = 0.0d;
                            cVar12.g = 7.0d;
                            cVar12.h = 3.0d;
                            cVar12.i = 60.0d;
                            cVar12.j = 5.0d;
                            cVar12.k = 90.0d;
                            cVar12.z = com.meituan.roodesign.resfetcher.runtime.c.a(context12, "waimai_c_weather_snow_heavy_1");
                            c cVar13 = new c();
                            arrayList6.add(cVar13);
                            cVar13.f = 500;
                            cVar13.b = 1.0d;
                            cVar13.c = 0.5d;
                            cVar13.n = 93.0d;
                            cVar13.o = 411.0d;
                            cVar13.p = -167.0d;
                            cVar13.q = 167.0d;
                            cVar13.r = 0.8d;
                            cVar13.s = 0.0d;
                            cVar13.g = 7.0d;
                            cVar13.h = 3.0d;
                            cVar13.i = 60.0d;
                            cVar13.j = 5.0d;
                            cVar13.k = 110.0d;
                            cVar13.z = com.meituan.roodesign.resfetcher.runtime.c.a(context12, "waimai_c_weather_snow_heavy_2");
                            c cVar14 = new c();
                            arrayList6.add(cVar14);
                            cVar14.f = 290;
                            cVar14.b = 1.0d;
                            cVar14.c = 0.5d;
                            cVar14.n = 93.0d;
                            cVar14.o = 411.0d;
                            cVar14.p = -167.0d;
                            cVar14.q = 167.0d;
                            cVar14.r = 0.8d;
                            cVar14.s = 0.0d;
                            cVar14.g = 7.0d;
                            cVar14.h = 3.0d;
                            cVar14.i = 60.0d;
                            cVar14.j = 5.0d;
                            cVar14.k = 105.0d;
                            cVar14.z = com.meituan.roodesign.resfetcher.runtime.c.a(context12, "waimai_c_weather_snow_heavy_3");
                            c cVar15 = new c();
                            arrayList6.add(cVar15);
                            cVar15.f = TbsListener.ErrorCode.RENAME_SUCCESS;
                            cVar15.b = 1.2999999523162842d;
                            cVar15.c = 0.5d;
                            cVar15.n = 93.0d;
                            cVar15.o = 411.0d;
                            cVar15.p = -167.0d;
                            cVar15.q = 167.0d;
                            cVar15.r = 0.8d;
                            cVar15.s = 0.0d;
                            cVar15.g = 7.0d;
                            cVar15.h = 3.0d;
                            cVar15.i = 60.0d;
                            cVar15.j = 5.0d;
                            cVar15.k = 120.0d;
                            cVar15.z = com.meituan.roodesign.resfetcher.runtime.c.a(context12, "waimai_c_weather_snow_rainstorm_1");
                            c cVar16 = new c();
                            arrayList6.add(cVar16);
                            cVar16.f = TXLiveConstants.RENDER_ROTATION_180;
                            cVar16.b = 0.800000011920929d;
                            cVar16.c = 0.20000000298023224d;
                            cVar16.n = 93.0d;
                            cVar16.o = 411.0d;
                            cVar16.p = -167.0d;
                            cVar16.q = 167.0d;
                            cVar16.r = 0.8d;
                            cVar16.s = 0.0d;
                            cVar16.g = 7.0d;
                            cVar16.h = 3.0d;
                            cVar16.i = 60.0d;
                            cVar16.j = 5.0d;
                            cVar16.k = 160.0d;
                            cVar16.z = com.meituan.roodesign.resfetcher.runtime.c.a(context12, "waimai_c_weather_snow_rainstorm_2");
                            cVarArr6 = (c[]) arrayList6.toArray(new c[0]);
                        }
                        dVar = new d(context11, cVarArr6);
                        break;
                    case SMOG:
                        Context context13 = this.e;
                        Object[] objArr9 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect9 = c.a;
                        if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "076dfeaa3f90c032cdf447791df6972d", RobustBitConfig.DEFAULT_VALUE)) {
                            cVarArr7 = (c[]) PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "076dfeaa3f90c032cdf447791df6972d");
                        } else {
                            c cVar17 = new c();
                            cVar17.f = 40;
                            cVar17.n = 187.0d;
                            cVar17.o = 187.0d;
                            cVar17.p = 133.0d;
                            cVar17.q = 133.0d;
                            cVar17.r = 0.5d;
                            cVar17.s = 0.1d;
                            cVar17.t = 0.0d;
                            cVar17.u = 0.0d;
                            cVar17.g = 4.0d;
                            cVar17.h = 1.0d;
                            cVar17.i = 0.0d;
                            cVar17.j = 7.0d;
                            cVar17.k = 18.0d;
                            cVar17.m = 6.0d;
                            Context context14 = com.meituan.android.singleton.b.a;
                            cVar17.A = new String[]{com.meituan.roodesign.resfetcher.runtime.c.a(context14, "waimai_c_weather_smog_1"), com.meituan.roodesign.resfetcher.runtime.c.a(context14, "waimai_c_weather_smog_2"), com.meituan.roodesign.resfetcher.runtime.c.a(context14, "waimai_c_weather_smog_3")};
                            cVarArr7 = new c[]{cVar17};
                        }
                        dVar = new d(context13, cVarArr7);
                        break;
                    case STRONG_WIND:
                        Context context15 = this.e;
                        Object[] objArr10 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect10 = c.a;
                        if (PatchProxy.isSupport(objArr10, null, changeQuickRedirect10, true, "3a20e7b860a39396a5df3208817a82fd", RobustBitConfig.DEFAULT_VALUE)) {
                            cVarArr8 = (c[]) PatchProxy.accessDispatch(objArr10, null, changeQuickRedirect10, true, "3a20e7b860a39396a5df3208817a82fd");
                        } else {
                            Context context16 = com.meituan.android.singleton.b.a;
                            ArrayList arrayList7 = new ArrayList();
                            c cVar18 = new c();
                            arrayList7.add(cVar18);
                            cVar18.f = 1;
                            cVar18.C = false;
                            cVar18.n = -267.0d;
                            cVar18.p = 43.0d;
                            cVar18.r = 1.0d;
                            cVar18.g = 5.4d;
                            cVar18.i = -2.0d;
                            cVar18.k = 300.18d;
                            cVar18.v = 0.0d;
                            cVar18.x = cVar18.g * 300.0d;
                            cVar18.z = com.meituan.roodesign.resfetcher.runtime.c.a(context16, "waimai_c_weather_wind_leaf_1");
                            c cVar19 = new c();
                            arrayList7.add(cVar19);
                            cVar19.f = 1;
                            cVar19.C = false;
                            cVar19.n = -384.0d;
                            cVar19.p = 63.0d;
                            cVar19.r = 1.0d;
                            cVar19.g = 5.4d;
                            cVar19.i = 10.0d;
                            cVar19.k = 304.628d;
                            cVar19.v = 0.0d;
                            cVar19.x = cVar19.g * 300.0d;
                            cVar19.z = com.meituan.roodesign.resfetcher.runtime.c.a(context16, "waimai_c_weather_wind_leaf_2");
                            cVarArr8 = (c[]) arrayList7.toArray(new c[0]);
                        }
                        dVar = new d(context15, cVarArr8);
                        break;
                    case STRONG_WIND_NEW:
                        Context context17 = this.e;
                        Object[] objArr11 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect11 = c.a;
                        if (PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "486acfe4abacb6f64cb9ae50e9257441", RobustBitConfig.DEFAULT_VALUE)) {
                            cVarArr9 = (c[]) PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "486acfe4abacb6f64cb9ae50e9257441");
                        } else {
                            ArrayList arrayList8 = new ArrayList();
                            int c = g.c(com.meituan.android.singleton.b.a, g.b(context));
                            c cVar20 = new c();
                            arrayList8.add(cVar20);
                            cVar20.f = 40;
                            cVar20.n = 20.0d;
                            cVar20.o = 180.0d;
                            double d = c;
                            cVar20.p = 0.2d * d;
                            cVar20.q = 0.15d * d;
                            cVar20.r = 0.15d;
                            cVar20.g = 2.0d;
                            cVar20.h = 1.5d;
                            cVar20.i = 0.0d;
                            cVar20.j = 0.0d;
                            cVar20.v = 0.0d;
                            cVar20.b = 1.600000023841858d;
                            cVar20.c = 0.4000000059604645d;
                            cVar20.k = 500.0d;
                            cVar20.m = 0.0d;
                            cVar20.B = true;
                            cVar20.z = com.meituan.roodesign.resfetcher.runtime.c.a(com.meituan.android.singleton.b.a, "waimai_c_wm_order_weather_strong_wind_line_top");
                            c cVar21 = new c();
                            arrayList8.add(cVar21);
                            cVar21.f = 30;
                            cVar21.n = 20.0d;
                            cVar21.o = 180.0d;
                            cVar21.p = 0.45d * d;
                            double d2 = d * 0.1d;
                            cVar21.q = d2;
                            cVar21.r = 0.15d;
                            cVar21.g = 2.0d;
                            cVar21.h = 1.5d;
                            cVar21.i = 0.0d;
                            cVar21.j = 0.0d;
                            cVar21.v = 0.0d;
                            cVar21.b = 1.2999999523162842d;
                            cVar21.c = 0.30000001192092896d;
                            cVar21.k = 500.0d;
                            cVar21.m = 0.0d;
                            cVar21.B = true;
                            cVar21.z = com.meituan.roodesign.resfetcher.runtime.c.a(com.meituan.android.singleton.b.a, "waimai_c_wm_order_weather_strong_wind_line_middle");
                            c cVar22 = new c();
                            arrayList8.add(cVar22);
                            cVar22.f = 20;
                            cVar22.n = 20.0d;
                            cVar22.o = 180.0d;
                            cVar22.p = d * 0.65d;
                            cVar22.q = d2;
                            cVar22.r = 0.1d;
                            cVar22.g = 2.0d;
                            cVar22.h = 1.5d;
                            cVar22.i = 0.0d;
                            cVar22.j = 0.0d;
                            cVar22.v = 0.0d;
                            cVar22.b = 1.0d;
                            cVar22.c = 0.20000000298023224d;
                            cVar22.k = 500.0d;
                            cVar22.m = 0.0d;
                            cVar22.B = true;
                            cVar22.z = com.meituan.roodesign.resfetcher.runtime.c.a(com.meituan.android.singleton.b.a, "waimai_c_wm_order_weather_strong_wind_line_down");
                            cVarArr9 = (c[]) arrayList8.toArray(new c[0]);
                        }
                        dVar = new d(context17, cVarArr9);
                        break;
                    case DUST_STORM:
                        Context context18 = this.e;
                        Object[] objArr12 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect12 = c.a;
                        if (PatchProxy.isSupport(objArr12, null, changeQuickRedirect12, true, "8f4c437e03cf96c45d27d188ba345505", RobustBitConfig.DEFAULT_VALUE)) {
                            cVarArr10 = (c[]) PatchProxy.accessDispatch(objArr12, null, changeQuickRedirect12, true, "8f4c437e03cf96c45d27d188ba345505");
                            context3 = context18;
                        } else {
                            ArrayList arrayList9 = new ArrayList();
                            int c2 = g.c(com.meituan.android.singleton.b.a, g.b(context2));
                            c cVar23 = new c();
                            arrayList9.add(cVar23);
                            cVar23.f = 40;
                            cVar23.n = 20.0d;
                            cVar23.o = 180.0d;
                            double d3 = c2;
                            cVar23.p = 0.2d * d3;
                            cVar23.q = 0.15d * d3;
                            cVar23.r = 0.15d;
                            cVar23.g = 2.0d;
                            cVar23.h = 1.5d;
                            cVar23.i = 0.0d;
                            cVar23.j = 0.0d;
                            cVar23.v = 0.0d;
                            cVar23.b = 1.600000023841858d;
                            cVar23.c = 0.4000000059604645d;
                            cVar23.k = 320.0d;
                            cVar23.m = 0.0d;
                            cVar23.B = true;
                            cVar23.z = com.meituan.roodesign.resfetcher.runtime.c.a(com.meituan.android.singleton.b.a, "waimai_c_wm_order_weather_sandstorm_line_top");
                            c cVar24 = new c();
                            arrayList9.add(cVar24);
                            cVar24.f = 30;
                            cVar24.n = 20.0d;
                            cVar24.o = 180.0d;
                            cVar24.p = 0.45d * d3;
                            double d4 = d3 * 0.1d;
                            cVar24.q = d4;
                            cVar24.r = 0.15d;
                            cVar24.g = 2.0d;
                            cVar24.h = 1.5d;
                            cVar24.i = 0.0d;
                            cVar24.j = 0.0d;
                            cVar24.v = 0.0d;
                            cVar24.b = 1.2999999523162842d;
                            cVar24.c = 0.30000001192092896d;
                            cVar24.k = 320.0d;
                            cVar24.m = 0.0d;
                            cVar24.B = true;
                            cVar24.z = com.meituan.roodesign.resfetcher.runtime.c.a(com.meituan.android.singleton.b.a, "waimai_c_wm_order_weather_sandstorm_line_middle");
                            c cVar25 = new c();
                            arrayList9.add(cVar25);
                            cVar25.f = 20;
                            cVar25.n = 20.0d;
                            cVar25.o = 180.0d;
                            cVar25.p = d3 * 0.65d;
                            cVar25.q = d4;
                            cVar25.r = 0.1d;
                            cVar25.g = 2.0d;
                            cVar25.h = 1.5d;
                            cVar25.i = 0.0d;
                            cVar25.j = 0.0d;
                            cVar25.v = 0.0d;
                            cVar25.b = 1.0d;
                            cVar25.c = 0.20000000298023224d;
                            cVar25.k = 320.0d;
                            cVar25.m = 0.0d;
                            cVar25.B = true;
                            cVar25.z = com.meituan.roodesign.resfetcher.runtime.c.a(com.meituan.android.singleton.b.a, "waimai_c_wm_order_weather_sandstorm_line_down");
                            cVarArr10 = (c[]) arrayList9.toArray(new c[0]);
                            context3 = context18;
                        }
                        dVar = new d(context3, cVarArr10);
                        break;
                    default:
                        dVar = new f(this.e) { // from class: com.sankuai.waimai.platform.widget.weather.WeatherView.1
                            @Override // com.sankuai.waimai.platform.widget.weather.f
                            public final void a(Canvas canvas) {
                            }

                            @Override // com.sankuai.waimai.platform.widget.weather.f
                            public final void b(Canvas canvas) {
                            }
                        };
                        break;
                }
            } else {
                dVar = (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22769b57d89d3e275447804fa18b0808");
            }
            setDrawer(dVar);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90b5bbc1b2f5fc7aa90d257ddd9de4ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90b5bbc1b2f5fc7aa90d257ddd9de4ee");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.g = i3 - i;
        this.h = i4 - i2;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe265fa683643e1625d08ec7e61250e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe265fa683643e1625d08ec7e61250e4");
            return;
        }
        super.onDraw(canvas);
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3926bbdb3c6f9968cc00e277e25e8a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3926bbdb3c6f9968cc00e277e25e8a0");
        } else {
            int i = this.g;
            int i2 = this.h;
            if (i != 0 && i2 != 0 && this.d != null) {
                this.d.a(i, i2);
                f fVar = this.d;
                Object[] objArr3 = {canvas};
                ChangeQuickRedirect changeQuickRedirect3 = f.e;
                if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "b50d14d7214ad00b8008da6e707dc04c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "b50d14d7214ad00b8008da6e707dc04c");
                } else {
                    fVar.a(canvas);
                    fVar.b(canvas);
                }
            }
        }
        postDelayed(new Runnable() { // from class: com.sankuai.waimai.platform.widget.weather.WeatherView.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "89d35be31be79eb60be50a2c00ea72ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "89d35be31be79eb60be50a2c00ea72ea");
                } else if (WeatherView.this.b) {
                    WeatherView.this.invalidate();
                }
            }
        }, 0L);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f0f3062e170f25dd82a2b21e924f8f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f0f3062e170f25dd82a2b21e924f8f0");
            return;
        }
        this.b = true;
        invalidate();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f5bb5f0147904fc1f2b74490b206f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f5bb5f0147904fc1f2b74490b206f7");
        } else {
            this.b = false;
        }
    }
}
