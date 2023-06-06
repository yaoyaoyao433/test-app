package com.sankuai.waimai.irmo.mach;

import android.support.annotation.NonNull;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerInfo;
import com.sankuai.waimai.irmo.render.bean.layers.VideoEffectParams;
import com.sankuai.waimai.irmo.utils.d;
import com.sankuai.waimai.mach.utils.g;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public int a;
    public int b;
    public int c;
    public String d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public IrmoLayerInfo j;

    public a(@NonNull IrmoLayerInfo irmoLayerInfo) {
        this.a = 1;
        this.b = 0;
        this.c = 1;
        this.e = 0;
        this.f = true;
        this.g = 0;
        this.h = 20;
        this.i = 46;
        this.j = irmoLayerInfo;
        VideoEffectParams videoEffectParams = irmoLayerInfo.effectParams instanceof VideoEffectParams ? (VideoEffectParams) irmoLayerInfo.effectParams : null;
        if (videoEffectParams == null) {
            return;
        }
        this.a = videoEffectParams.count;
        this.e = videoEffectParams.contentMode;
        this.g = videoEffectParams.volumeControlVisible ? 1 : 0;
        this.f = !videoEffectParams.keepLastFrame;
        d.b("VideoBaseConfig_Irmo 播放次数playCount: " + this.a + " 裁切contentMode: " + this.e + " 显示音量(1): " + this.g + " 不保留最后一帧: " + this.f, new Object[0]);
    }

    public a(Map<String, Object> map) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        this.a = 1;
        this.b = 0;
        this.c = 1;
        this.e = 0;
        this.f = true;
        this.g = 0;
        this.h = 20;
        this.i = 46;
        if (map == null) {
            return;
        }
        if (map.containsKey("play-count") && (obj9 = map.get("play-count")) != null) {
            this.a = (int) g.b(obj9.toString());
        }
        if (map.containsKey("interaction-type") && (obj8 = map.get("interaction-type")) != null) {
            this.b = g.c(obj8.toString());
        }
        if (map.containsKey("player-action") && (obj7 = map.get("player-action")) != null) {
            this.c = g.c(obj7.toString());
        }
        if (map.containsKey("extra-info") && (obj6 = map.get("extra-info")) != null) {
            this.d = obj6.toString();
        }
        if (map.containsKey("content-mode") && (obj5 = map.get("content-mode")) != null) {
            this.e = g.c(obj5.toString());
        }
        if (map.containsKey("finish-destroy") && (obj4 = map.get("finish-destroy")) != null) {
            this.f = g.c(obj4.toString()) == 1;
        }
        if (map.containsKey("volume-control-visible") && (obj3 = map.get("volume-control-visible")) != null) {
            this.g = g.c(obj3.toString());
        }
        if (map.containsKey("volume-control-margin-left") && (obj2 = map.get("volume-control-margin-left")) != null) {
            this.h = g.c(obj2.toString());
        }
        if (!map.containsKey("volume-control-margin-top") || (obj = map.get("volume-control-margin-top")) == null) {
            return;
        }
        this.i = g.c(obj.toString());
    }
}
