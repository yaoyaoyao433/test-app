package com.taobao.gcanvas.bridges.spec.module;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GImageLoadInfo {
    public static final int IDLE = -1;
    public static final int LOADED = 512;
    public static final int LOADING = 256;
    public int height;
    public int id;
    public AtomicInteger status = new AtomicInteger(-1);
    public int width;
}
