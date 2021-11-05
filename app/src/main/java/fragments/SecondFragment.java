package fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mlesson6.AdapterOfFirst;
import com.example.mlesson6.AdapterOfSecond;
import com.example.mlesson6.ModelOfFirstFragment;
import com.example.mlesson6.ModelOfSecondFragment;
import com.example.mlesson6.R;
import com.example.mlesson6.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    private AdapterOfSecond adapter;
    private ArrayList<ModelOfSecondFragment> arrayList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new AdapterOfSecond();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerView();
    }

    private ArrayList<ModelOfSecondFragment> addList() {
        arrayList = new ArrayList<>();
        arrayList.add(new ModelOfSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_1, R.drawable.img_2));
        return arrayList;
    }

    private void initRecyclerView() {
        adapter.updateData(addList());
        binding.rvSecondFragment.setAdapter(adapter);
    }
}