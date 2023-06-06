package com.meituan.msi.api.record;

import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class StartParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public RecordMtParam _mt;
    public String audioSource;
    public int duration;
    public int encodeBitRate;
    public String format;
    public Integer frameSize;
    public int numberOfChannels;
    public int sampleRate;

    public StartParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77c9d17fe78c21e10317aef44eed29b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77c9d17fe78c21e10317aef44eed29b8");
            return;
        }
        this.duration = 60000;
        this.sampleRate = 8000;
        this.numberOfChannels = 2;
        this.encodeBitRate = 48000;
        this.format = "aac";
        this.audioSource = FpsEvent.TYPE_SCROLL_AUTO;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6116f46c5f6889632f8fc0ee297c7d44", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6116f46c5f6889632f8fc0ee297c7d44");
        }
        if (("StartParam{duration=" + this.duration + ", sampleRate=" + this.sampleRate + ", numberOfChannels=" + this.numberOfChannels + ", encodeBitRate=" + this.encodeBitRate + ", format='" + this.format) != null) {
            return this.format;
        }
        if ((" ', frameSize=" + this.frameSize + ", audioSource='" + this.audioSource) != null) {
            return this.audioSource;
        }
        StringBuilder sb = new StringBuilder(" ', _mt=");
        sb.append(this._mt);
        return sb.toString() != null ? this._mt.toString() : " }";
    }
}
