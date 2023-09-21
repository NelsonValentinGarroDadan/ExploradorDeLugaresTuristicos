package com.example.exploradordelugarestursticos.ui.lugaresTuristicos;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.exploradordelugarestursticos.ui.lugaresTuristicos.Model.LugarTuristico;

import java.util.ArrayList;
import java.util.List;

public class LugaresTuristicosViewModel extends AndroidViewModel {

    private Context context;
    private MutableLiveData<List<LugarTuristico>> ListaM;
    public LugaresTuristicosViewModel(@NonNull Application application) {
        super(application);
        context = application;
    }
    public LiveData getMutable(){
        if(ListaM==null){
            ListaM = new MutableLiveData<>();
        }
        return ListaM;
    }
    public void cargarLista(){
        List<LugarTuristico> lista = new ArrayList<LugarTuristico>();
        lista.add(new LugarTuristico("La Replica del Cabildo","La obra tiene una superficie de 2.008 m2, es de arquitectura colonial en la que se respetó el espesor de los muros originales. Lla carpintería de puertas y postigos fue realizada en la provincia de Jujuy. La herrería y rejas son de hierro fundido, forjado y martillado fiel a los originales trabajados artesanalmente.","La réplica del Cabildo (del original) fue hecha en conmemoración del Bicentenario, en 2010. Está destinado a actividades recreativas, turísticas, culturales, pedagógicas y de interés histórico. Además tiene una réplica de la Pirámide de Mayo del primer aniversario del 25 de mayo en 1811.\n" +
                "\n" +
                "Allí se ofrece un recorrido para conocer la historia argentina desde sus inicios, con figuras de yeso que recuerdan a los patriotas que allí estuvieron. El espacio es también una casa cultural en la que se realizan exposiciones de artesanías, pinturas, esculturas, fotografías, encuentros de historiadores y sirvió de escenario para la presentación de variados artistas."));
        lista.add(new LugarTuristico("PLaza Pringles","La primavera se encuentra en la esquina de Rivadavia y Pringles, la de San Martín y Pringles representa el verano por eso es la mas destapada, a cada una de esta dos cálidas estaciones las acompaña un niño como alegoría de la fecundidad.","Ciudad de San Luis. Manzana delimitada por las calles Rivadavia, Pringles, Junín y San Martín. Principal plaza comercial, financiera y de encuentro, bautizada en honor al máximo héroe libertador puntano. A principios del siglo pasado el espacio ocupado hoy por la plaza Pringles era un potrero lleno de paja y malezas conocido por el nombre Potrero de rey ramos en la segunda mitad del siglo pasado se levanta allí el histórico parque Pringles que también ha sido llamado la Plaza de las Flores."));
        ListaM.setValue(lista);
    }
}