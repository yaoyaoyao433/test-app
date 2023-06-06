package com.dianping.jscore;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class JSHeapStatistics {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long external_memory;
    private long heap_size_limit;
    private long malloced_memory;
    private long number_of_detached_contexts;
    private long number_of_native_contexts;
    private long peak_malloced_memory;
    private long total_available_size;
    private long total_heap_size;
    private long total_heap_size_executable;
    private long total_physical_size;
    private long used_heap_size;

    public long getTotal_heap_size() {
        return this.total_heap_size;
    }

    public void setTotal_heap_size(long j) {
        this.total_heap_size = j;
    }

    public long getTotal_heap_size_executable() {
        return this.total_heap_size_executable;
    }

    public void setTotal_heap_size_executable(long j) {
        this.total_heap_size_executable = j;
    }

    public long getTotal_physical_size() {
        return this.total_physical_size;
    }

    public void setTotal_physical_size(long j) {
        this.total_physical_size = j;
    }

    public long getTotal_available_size() {
        return this.total_available_size;
    }

    public void setTotal_available_size(long j) {
        this.total_available_size = j;
    }

    public long getUsed_heap_size() {
        return this.used_heap_size;
    }

    public void setUsed_heap_size(long j) {
        this.used_heap_size = j;
    }

    public long getHeap_size_limit() {
        return this.heap_size_limit;
    }

    public void setHeap_size_limit(long j) {
        this.heap_size_limit = j;
    }

    public long getMalloced_memory() {
        return this.malloced_memory;
    }

    public void setMalloced_memory(long j) {
        this.malloced_memory = j;
    }

    public long getExternal_memory() {
        return this.external_memory;
    }

    public void setExternal_memory(long j) {
        this.external_memory = j;
    }

    public long getPeak_malloced_memory() {
        return this.peak_malloced_memory;
    }

    public void setPeak_malloced_memory(long j) {
        this.peak_malloced_memory = j;
    }

    public long getNumber_of_native_contexts() {
        return this.number_of_native_contexts;
    }

    public void setNumber_of_native_contexts(long j) {
        this.number_of_native_contexts = j;
    }

    public long getNumber_of_detached_contexts() {
        return this.number_of_detached_contexts;
    }

    public void setNumber_of_detached_contexts(long j) {
        this.number_of_detached_contexts = j;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffbf00ab7b6fec6863ff377a757be9ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffbf00ab7b6fec6863ff377a757be9ea");
        }
        return "JSHeapStatistics{total_heap_size=" + this.total_heap_size + ", total_heap_size_executable=" + this.total_heap_size_executable + ", total_physical_size=" + this.total_physical_size + ", total_available_size=" + this.total_available_size + ", used_heap_size=" + this.used_heap_size + ", heap_size_limit=" + this.heap_size_limit + ", malloced_memory=" + this.malloced_memory + ", external_memory=" + this.external_memory + ", peak_malloced_memory=" + this.peak_malloced_memory + ", number_of_native_contexts=" + this.number_of_native_contexts + ", number_of_detached_contexts=" + this.number_of_detached_contexts + '}';
    }
}
