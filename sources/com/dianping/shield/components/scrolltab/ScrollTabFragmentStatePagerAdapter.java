package com.dianping.shield.components.scrolltab;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class ScrollTabFragmentStatePagerAdapter<T> extends PagerAdapter {
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentStatePagerAdapt";
    public static ChangeQuickRedirect changeQuickRedirect;
    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final FragmentManager mFragmentManager;
    private ArrayList<ItemInfo<T>> mItemInfos;
    private boolean mNeedProcessCache;
    private ArrayList<Fragment.SavedState> mSavedState;

    public abstract boolean dataEquals(T t, T t2);

    public abstract int getDataPosition(T t, int i);

    public abstract Fragment getItem(int i);

    public abstract T getItemData(int i);

    public ScrollTabFragmentStatePagerAdapter(FragmentManager fragmentManager) {
        Object[] objArr = {fragmentManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63b44a9563aa379478c2a15a1f3592be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63b44a9563aa379478c2a15a1f3592be");
            return;
        }
        this.mCurTransaction = null;
        this.mSavedState = new ArrayList<>();
        this.mItemInfos = new ArrayList<>();
        this.mCurrentPrimaryItem = null;
        this.mNeedProcessCache = false;
        this.mFragmentManager = fragmentManager;
    }

    public Fragment getCachedItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09b79bd15febc90b98a27097a1de7ae8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09b79bd15febc90b98a27097a1de7ae8");
        }
        if (this.mItemInfos.size() > i) {
            return this.mItemInfos.get(i).fragment;
        }
        return null;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce2dd6c32b6c0714089a4f4e32be1df4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce2dd6c32b6c0714089a4f4e32be1df4");
        } else if (viewGroup.getId() != -1) {
        } else {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        ItemInfo<T> itemInfo;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c72ee6482df05480c1f59539f0b3a0b", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c72ee6482df05480c1f59539f0b3a0b");
        }
        if (this.mItemInfos.size() > i && (itemInfo = this.mItemInfos.get(i)) != null) {
            if (itemInfo.position == i) {
                return itemInfo;
            }
            checkProcessCacheChanged();
        }
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        Fragment item = getItem(i);
        if (this.mSavedState.size() > i && (savedState = this.mSavedState.get(i)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.mItemInfos.size() <= i) {
            this.mItemInfos.add(null);
        }
        item.setMenuVisibility(false);
        item.setUserVisibleHint(false);
        ItemInfo<T> itemInfo2 = new ItemInfo<>(item, getItemData(i), i);
        this.mItemInfos.set(i, itemInfo2);
        this.mCurTransaction.add(viewGroup.getId(), item);
        return itemInfo2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "128bb8ceced55e05622eee9d27845ef8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "128bb8ceced55e05622eee9d27845ef8");
            return;
        }
        ItemInfo itemInfo = (ItemInfo) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        while (this.mSavedState.size() <= i) {
            this.mSavedState.add(null);
        }
        this.mSavedState.set(i, itemInfo.fragment.isAdded() ? this.mFragmentManager.saveFragmentInstanceState(itemInfo.fragment) : null);
        while (this.mItemInfos.size() <= i) {
            this.mItemInfos.add(null);
        }
        if (itemInfo.position != -2) {
            for (int i2 = 0; i2 < this.mItemInfos.size(); i2++) {
                ItemInfo<T> itemInfo2 = this.mItemInfos.get(i2);
                if (itemInfo2 != null && itemInfo2.position == itemInfo.position) {
                    this.mItemInfos.set(i2, null);
                }
            }
            this.mCurTransaction.remove(itemInfo.fragment);
            return;
        }
        if (this.mItemInfos.size() > i) {
            this.mItemInfos.set(i, null);
        }
        this.mCurTransaction.remove(itemInfo.fragment);
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment;
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbd99233d021681532bad792b01eaad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbd99233d021681532bad792b01eaad9");
            return;
        }
        ItemInfo itemInfo = (ItemInfo) obj;
        if (itemInfo == null || (fragment = itemInfo.fragment) == this.mCurrentPrimaryItem) {
            return;
        }
        if (this.mCurrentPrimaryItem != null) {
            this.mCurrentPrimaryItem.setMenuVisibility(false);
            this.mCurrentPrimaryItem.setUserVisibleHint(false);
        }
        if (fragment != null) {
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
        }
        this.mCurrentPrimaryItem = fragment;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f0405df9d15ac07e7874e1287786a70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f0405df9d15ac07e7874e1287786a70");
        } else if (this.mCurTransaction != null) {
            this.mCurTransaction.commitNowAllowingStateLoss();
            this.mCurTransaction = null;
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        Object[] objArr = {view, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6f3769f9499dd0bf20ed9931756ee5c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6f3769f9499dd0bf20ed9931756ee5c")).booleanValue() : ((ItemInfo) obj).fragment.getView() == view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aef7e09d60047b360d46473dc5ac8a51", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aef7e09d60047b360d46473dc5ac8a51")).intValue();
        }
        this.mNeedProcessCache = true;
        ItemInfo itemInfo = (ItemInfo) obj;
        int indexOf = this.mItemInfos.indexOf(itemInfo);
        if (indexOf >= 0) {
            D d = itemInfo.data;
            if (dataEquals(d, getItemData(indexOf))) {
                return -1;
            }
            ItemInfo<T> itemInfo2 = this.mItemInfos.get(indexOf);
            int dataPosition = getDataPosition(d, indexOf);
            if (dataPosition < 0) {
                dataPosition = -2;
            }
            if (itemInfo2 != null) {
                itemInfo2.position = dataPosition;
            }
            return dataPosition;
        }
        return -1;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void notifyDataSetChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7190bd8f866ee9e40fbb826ef134942a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7190bd8f866ee9e40fbb826ef134942a");
            return;
        }
        super.notifyDataSetChanged();
        checkProcessCacheChanged();
    }

    private void checkProcessCacheChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41a4beafe3ba7bb69b2ebfde3de854ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41a4beafe3ba7bb69b2ebfde3de854ef");
        } else if (this.mNeedProcessCache) {
            this.mNeedProcessCache = false;
            ArrayList<ItemInfo<T>> arrayList = new ArrayList<>(this.mItemInfos.size());
            for (int i = 0; i < this.mItemInfos.size(); i++) {
                arrayList.add(null);
            }
            Iterator<ItemInfo<T>> it = this.mItemInfos.iterator();
            while (it.hasNext()) {
                ItemInfo<T> next = it.next();
                if (next != null && next.position >= 0) {
                    while (arrayList.size() <= next.position) {
                        arrayList.add(null);
                    }
                    arrayList.set(next.position, next);
                }
            }
            this.mItemInfos = arrayList;
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public Parcelable saveState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99134bfbb3e6d3b12645e4d42b334c32", RobustBitConfig.DEFAULT_VALUE)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99134bfbb3e6d3b12645e4d42b334c32");
        }
        Bundle bundle = null;
        if (this.mSavedState.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.mSavedState.size()];
            this.mSavedState.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        }
        for (int i = 0; i < this.mItemInfos.size(); i++) {
            Fragment fragment = this.mItemInfos.get(i).fragment;
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.mFragmentManager.putFragment(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        Object[] objArr = {parcelable, classLoader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84f02a8261a2ff8ee938cf7073d98c84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84f02a8261a2ff8ee938cf7073d98c84");
        } else if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.mSavedState.clear();
            this.mItemInfos.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.mSavedState.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment fragment = this.mFragmentManager.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.mItemInfos.size() <= parseInt) {
                            this.mItemInfos.add(null);
                        }
                        fragment.setMenuVisibility(false);
                        this.mItemInfos.set(parseInt, new ItemInfo<>(fragment, getItemData(parseInt), parseInt));
                    } else {
                        new StringBuilder("Bad fragment at key ").append(str);
                    }
                }
            }
        }
    }

    public Fragment getCurrentPrimaryItem() {
        return this.mCurrentPrimaryItem;
    }

    public Fragment getFragmentByPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24184f14763a2eaa911b97610005fa57", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24184f14763a2eaa911b97610005fa57");
        }
        if (i < 0 || i >= this.mItemInfos.size()) {
            return null;
        }
        return this.mItemInfos.get(i).fragment;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ItemInfo<D> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public D data;
        public Fragment fragment;
        public int position;

        public ItemInfo(Fragment fragment, D d, int i) {
            this.fragment = fragment;
            this.data = d;
            this.position = i;
        }
    }
}
