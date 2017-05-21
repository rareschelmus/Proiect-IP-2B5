using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class showMenu : MonoBehaviour
{
    List<string> etaj = new List<string>() { "Alege Etaj", "Parter", "Etaj 1", "Etaj 2" };
    List<string> camera_etaj0 = new List<string>() { "Alege camera", "C112", "C113", "C114", "C115" };
    List<string> camera_etaj1 = new List<string>() { "Alege camera", "C308", "C309", "C310", "C311" };
    List<string> camera_etaj2 = new List<string>() { "Alege camera", "C402", "C403", "C404", "C405", "C406", "C407", "C408", "C409", "C410", "C411", "C412", "C413", "C414" };


    public Dropdown dd_3d_etaj;
    public Dropdown dd_3d_camera;
    public Dropdown dd_2d_etaj;

    
    public void showCamera(Dropdown dd)
    {
        dd.ClearOptions();
        if (dd.value == 1)
            dd_3d_camera.AddOptions(camera_etaj0);
        else if (dd.value == 2)
            dd_3d_camera.AddOptions(camera_etaj1);
        else if (dd.value == 3)
            dd_3d_camera.AddOptions(camera_etaj2);
    }

    void Start()
    {
        Populare();
    }

    void Populare()
    {
        dd_3d_etaj.AddOptions(etaj);
        dd_3d_camera.AddOptions(camera_etaj2);
        //showCamera(dd_2d_etaj);
        dd_2d_etaj.AddOptions(etaj);
    }

    void Update()
    {
        //dd_3d_etaj.onValueChanged.AddListener(delegate { showCamera(dd_2d_etaj); });
    }
}
