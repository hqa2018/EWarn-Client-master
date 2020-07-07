
package com.taide.ewarn.fragment.discover;

import androidx.recyclerview.widget.RecyclerView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.taide.ewarn.R;
import com.taide.ewarn.core.BaseFragment;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xui.widget.actionbar.TitleBar;

import butterknife.BindView;

@Page
public class DiscoverFragment extends BaseFragment {

    @BindView(R.id.discover_recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.discover_refreshLayout)
    SmartRefreshLayout refreshLayout;

    /**
     * @return 返回为 null意为不需要导航栏
     */
    @Override
    protected TitleBar initTitle() {
        return null;
    }

    /**
     * 布局的资源id
     *
     * @return
     */
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_discover;
    }

    /**
     * 初始化控件
     */
    @Override
    protected void initViews() {

    }
}
