package com.meituan.android.common.statistics.channel;

import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.ad.MidasInfo;
import com.meituan.android.common.statistics.entity.BusinessInfo;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.ipc.RemoteProxyThread;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbstractChannel extends RemoteProxyThread implements IChannelInterface {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void write(String str, EventInfo eventInfo) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeAdEvent(@NonNull String str, String str2, Map<String, Object> map, String str3, EventName eventName, MidasInfo midasInfo, boolean z) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeAutoPageView(@NonNull String str, Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeAutoPageView(Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeAutoPageView(Map<String, Object> map, EventLevel eventLevel) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map, String str3) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeBizOrder(String str, Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeBizOrder(String str, Map<String, Object> map, String str2) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map, String str3) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeBizPay(String str, Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeBizPay(String str, Map<String, Object> map, String str2) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeEvent(EventInfo eventInfo) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeEvent(EventName eventName, BusinessInfo businessInfo, Map<String, Object> map, String str, String str2, String str3, String str4, String str5) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeEvent(EventName eventName, String str, String str2, String str3, String str4, String str5) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeEvent(String str) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeEvent(@NonNull String str, EventName eventName, BusinessInfo businessInfo, Map<String, Object> map, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, int i) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, int i) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z, boolean z2) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelClick(String str, Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelClick(String str, Map<String, Object> map, int i) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelClick(String str, Map<String, Object> map, String str2) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelClick(String str, Map<String, Object> map, String str2, int i) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map, String str3) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface, com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelEdit(String str, Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelEdit(String str, Map<String, Object> map, String str2) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, int i) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, String str3) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelView(String str, String str2, Map<String, Object> map, String str3, int i) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelView(String str, Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelView(String str, Map<String, Object> map, int i) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelView(String str, Map<String, Object> map, String str2) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelView(String str, Map<String, Object> map, String str2, int i) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writePageDisappear(@NonNull String str, Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writePageDisappear(Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writePageTrack(String str, String str2) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writePageView(String str, Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeShow(String str, Map<String, Object> map, String str2, String str3) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeSystemCheck(String str, String str2, Map<String, Object> map) {
    }
}
