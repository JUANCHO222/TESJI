#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;

int main()
{
	srand(time(0));

	

    system("start winword");
	
	clock_t t;
	t=clock();
	
	t=1000*clock()-t;
	cout<<"el tiempo de ejecucion de word fue de: "<<float(t)/CLOCKS_PER_SEC<<" milisegundos.";
	
	return 0;
}                     
