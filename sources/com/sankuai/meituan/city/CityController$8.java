package com.sankuai.meituan.city;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.Loader;
import com.meituan.android.common.locate.AddressResult;
import com.meituan.android.common.locate.GeoCoderImplRetrofit;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.sniffer.ISniffer;
import com.meituan.android.common.sniffer.SnifferProxy;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.city.c;
import com.sankuai.meituan.takeoutnew.util.aop.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CityController$8 implements Loader.OnLoadCompleteListener<MtLocation> {
    public static ChangeQuickRedirect a;
    public final /* synthetic */ a b;

    @Override // android.support.v4.content.Loader.OnLoadCompleteListener
    @SuppressLint({"StaticFieldLeak"})
    public /* synthetic */ void onLoadComplete(@NonNull Loader<MtLocation> loader, @Nullable MtLocation mtLocation) {
        MetricsSpeedMeterTask metricsSpeedMeterTask;
        long j;
        long j2;
        double d;
        MetricsSpeedMeterTask metricsSpeedMeterTask2;
        MtLocation mtLocation2 = mtLocation;
        Object[] objArr = {loader, mtLocation2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95e8c9ea123a9ae0445624796a8bcae3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95e8c9ea123a9ae0445624796a8bcae3");
            return;
        }
        metricsSpeedMeterTask = this.b.p;
        h.a(metricsSpeedMeterTask.recordStep("CityControllerLocate:Locate_SDK_Success"));
        a aVar = this.b;
        long currentTimeMillis = System.currentTimeMillis();
        j = this.b.b;
        aVar.c = currentTimeMillis - j;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Locate_Logan:定位SDK正常返回，耗时：");
        j2 = this.b.c;
        sb2.append(j2);
        sb.append(sb2.toString());
        if (!a.a(this.b, mtLocation2)) {
            sb.append(", 数据为null");
        } else {
            String str = "";
            double d2 = 0.0d;
            if (mtLocation2.getExtras() != null) {
                str = mtLocation2.getExtras().getString("from");
                d2 = mtLocation2.getExtras().getDouble("gpslat");
                d = mtLocation2.getExtras().getDouble("gpslng");
            } else {
                d = 0.0d;
            }
            sb.append(", " + mtLocation2.getLatitude() + CommonConstant.Symbol.COLON + mtLocation2.getLongitude() + ",provider:" + mtLocation2.getProvider() + ",accuracy:" + mtLocation2.getAccuracy() + ",from:" + str + ",time:" + mtLocation2.getTime() + ",gpslatlng:" + d2 + CommonConstant.Symbol.COMMA + d);
        }
        com.dianping.networklog.c.a(sb.toString(), 3);
        a.a(this.b, true);
        SnifferProxy.getSniffer().normal("biz_city_controller", "city_controller_locate_exception", "locate_sdk_success");
        if (!a.a(this.b, mtLocation2)) {
            c.a.a.a(new Runnable() { // from class: com.sankuai.meituan.city.CityController$8.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    long j3;
                    long j4;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1438f277c67844ebcc6f5dc1cbe8d09", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1438f277c67844ebcc6f5dc1cbe8d09");
                        return;
                    }
                    a.b(CityController$8.this.b, (MtLocation) null);
                    ISniffer sniffer = SnifferProxy.getSniffer();
                    StringBuilder sb3 = new StringBuilder("定位SDK返回数据为空，定位耗时为：");
                    j3 = CityController$8.this.b.c;
                    sb3.append(j3);
                    sb3.append("ms,切换到定位失败线程耗时为：");
                    long currentTimeMillis2 = System.currentTimeMillis();
                    j4 = CityController$8.this.b.c;
                    sb3.append(currentTimeMillis2 - j4);
                    sniffer.smell("biz_city_controller", "city_controller_locate_data_exception", "locate_data_fail", sb3.toString());
                }
            });
            return;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        metricsSpeedMeterTask2 = this.b.p;
        metricsSpeedMeterTask2.recordStep("CityControllerLocate:Change_UI_Thread_Start");
        c.a.a.a(new AnonymousClass2(currentTimeMillis2, mtLocation2));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.city.CityController$8$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ long b;
        public final /* synthetic */ MtLocation c;

        public AnonymousClass2(long j, MtLocation mtLocation) {
            this.b = j;
            this.c = mtLocation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MetricsSpeedMeterTask metricsSpeedMeterTask;
            long j;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b84bf0af1f76adb436379e3c52fe3e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b84bf0af1f76adb436379e3c52fe3e");
                return;
            }
            metricsSpeedMeterTask = CityController$8.this.b.p;
            h.a(metricsSpeedMeterTask.recordStep("CityControllerLocate:Change_UI_Thread_Success"));
            CityController$8.this.b.d = System.currentTimeMillis() - this.b;
            StringBuilder sb = new StringBuilder("Locate_Logan:定位数据正常，切换到定位成功线程耗时：");
            j = CityController$8.this.b.d;
            sb.append(j);
            com.dianping.networklog.c.a(sb.toString(), 3);
            a.b(CityController$8.this.b, this.c);
            SnifferProxy.getSniffer().normal("biz_city_controller", "city_controller_locate_data_exception", "locate_data_success");
            Bundle extras = this.c.getExtras();
            long j2 = extras != null ? extras.getLong(GearsLocator.MT_CITY_ID, -1L) : -1L;
            if (j2 != -1) {
                CityController$8.this.b.b(j2);
                a.c(CityController$8.this.b, System.currentTimeMillis());
                AddressResult addressResult = new AddressResult();
                addressResult.setCityId((int) j2);
                addressResult.setCity(extras.getString("city"));
                addressResult.setDistrict(extras.getString(GearsLocator.DISTRICT));
                addressResult.setDetail(extras.getString(GearsLocator.DETAIL));
                a.a(CityController$8.this.b, addressResult);
                SnifferProxy.getSniffer().normal("biz_city_controller", "city_controller_locate_data_exception", "geo_success");
                return;
            }
            com.sankuai.android.jarvis.c.a("city_location", new Runnable() { // from class: com.sankuai.meituan.city.CityController.8.2.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    MetricsSpeedMeterTask metricsSpeedMeterTask2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b270c30a0ed352a2acd5ca5c9950fedd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b270c30a0ed352a2acd5ca5c9950fedd");
                        return;
                    }
                    metricsSpeedMeterTask2 = CityController$8.this.b.p;
                    metricsSpeedMeterTask2.recordStep("CityControllerLocate:Geo_Thread_Start");
                    final AddressResult addressResult2 = null;
                    try {
                        addressResult2 = new GeoCoderImplRetrofit().getAddress(AnonymousClass2.this.c);
                    } catch (Exception unused) {
                    }
                    c.a.a.a(new Runnable() { // from class: com.sankuai.meituan.city.CityController.8.2.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            MetricsSpeedMeterTask metricsSpeedMeterTask3;
                            long j3;
                            long j4;
                            long j5;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fcc2ccf08e82898624188a793224c2d1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fcc2ccf08e82898624188a793224c2d1");
                                return;
                            }
                            metricsSpeedMeterTask3 = CityController$8.this.b.p;
                            h.a(metricsSpeedMeterTask3.recordStep("CityControllerLocate:Geo_Thread_Success"));
                            a aVar = CityController$8.this.b;
                            long currentTimeMillis = System.currentTimeMillis();
                            j3 = CityController$8.this.b.d;
                            aVar.e = currentTimeMillis - j3;
                            StringBuilder sb2 = new StringBuilder("Locate_Logan:定位数据没有城市信息，切换到逆地址解析结束线程耗时：");
                            j4 = CityController$8.this.b.e;
                            sb2.append(j4);
                            com.dianping.networklog.c.a(sb2.toString(), 3);
                            if (addressResult2 != null && addressResult2.getCityId() != -1) {
                                CityController$8.this.b.b(addressResult2.getCityId());
                                a.c(CityController$8.this.b, System.currentTimeMillis());
                            }
                            a.a(CityController$8.this.b, addressResult2);
                            if (addressResult2 != null) {
                                SnifferProxy.getSniffer().normal("biz_city_controller", "city_controller_locate_data_exception", "geo_success");
                            } else {
                                ISniffer sniffer = SnifferProxy.getSniffer();
                                StringBuilder sb3 = new StringBuilder("定位数据没有城市信息，切换到逆地址解析结束线程耗时：");
                                j5 = CityController$8.this.b.e;
                                sb3.append(j5);
                                sniffer.smell("biz_city_controller", "city_controller_locate_data_exception", "geo_fail", sb3.toString());
                            }
                            SnifferProxy.getSniffer().normal("CityController", "city", "run");
                        }
                    });
                }
            }).start();
        }
    }
}
