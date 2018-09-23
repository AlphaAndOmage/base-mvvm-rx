package com.android.asiantech.rx_mvvm_base.ui.user.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.asiantech.rx_mvvm_base.R
import com.android.asiantech.rx_mvvm_base.ui.base.BaseFragment
import com.android.asiantech.rx_mvvm_base.ui.user.UserActivity
import kotlinx.android.synthetic.main.fragment_login.*

/**
 *
 * @author at-vinhhuynh
 */
class LoginFragment : BaseFragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListener()
    }

    override fun onBindViewModel() {}

    private fun initListener() {
        tvSignUp.setOnClickListener {
            (activity as? UserActivity)?.openRegisterFragment()
        }

        btnLogin.setOnClickListener {
        }
    }

}